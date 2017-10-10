/*
 * Copyright (c) 2017, lovcreate.com. All rights reserved.
 */
package com.lovcreate.service.impl;

import com.google.common.hash.Hashing;
import com.lovcreate.api.ApiErrorCode;
import com.lovcreate.api.ApiResult;
import com.lovcreate.api.bean.request.UserRequest;
import com.lovcreate.api.bean.response.UserResponse;
import com.lovcreate.api.service.UserService;
import com.lovcreate.service.dao.RoleActionMapper;
import com.lovcreate.service.dao.UserMapper;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/**
 * Created by DuChuanLei on 2017/6/28
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Resource
    RoleActionMapper roleActionMapper;

    @Override
    public Integer insert(UserRequest userRequest) {

        return userMapper.insert(userRequest);
    }

    @Override
    public ApiResult<UserResponse> checkLogin(String userName, String password) {
        UserResponse userResponse = userMapper.selectPassWord(userName);
        if (null == userResponse) {
            return ApiResult.newFailure(ApiErrorCode.MANAGER_CHECK_NAME_FAILED.getCode(), "用户名不存在");
        }
        UserResponse response = userMapper.checkLogin(userName,
                Hashing.md5().hashString(password, Charset.forName("UTF-8")).toString());
        if (null == response){
            return ApiResult.newFailure(ApiErrorCode.MANAGER_CHECK_LOGIN_FAILED.getCode(), "用户名或密码错误");
        }
        List<Integer> actionId = roleActionMapper.selectActionIdByManager(userResponse.getId());
        userResponse.setRoleId(CollectionUtils.isEmpty(actionId) ? Collections.EMPTY_LIST : actionId);
        return ApiResult.newSuccess(userResponse);
    }

    public static void main(String[] args) throws IOException {
        int port = 5599;
        ServerSocket server = new ServerSocket(port);
        Socket socket = server.accept();
        Reader reader = new InputStreamReader(socket.getInputStream());
        char chars[] = new char[64];
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len = reader.read(chars)) != -1) {
            sb.append(new String(chars, 0, len));
        }
        System.out.println();

        reader.close();
        socket.close();
        server.close();

    }
}
