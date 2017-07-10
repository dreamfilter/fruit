/*
 * Copyright (c) 2017, lovcreate.com. All rights reserved.
 */
package com.lovcreate.service.impl;

import com.lovcreate.api.bean.request.UserRequest;
import com.lovcreate.api.service.UserService;
import com.lovcreate.service.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by DuChuanLei on 2017/6/28
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public Integer insert(UserRequest userRequest) {

        return userMapper.insert(userRequest);
    }

    public static void main(String[] args) throws IOException {
        int port=5599;
        ServerSocket server= new ServerSocket(port);
        Socket socket=server.accept();
        Reader reader=new InputStreamReader(socket.getInputStream());
        char chars[] =new char[64];
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len=reader.read(chars))!=-1){
            sb.append(new String(chars,0,len));
        }
        System.out.println();

        reader.close();
        socket.close();
        server.close();

    }
}
