/*
 * Copyright (c) 2017, lovcreate.com. All rights reserved.
 */
package com.lovcreate.mgt.controller;

import com.lovcreate.api.ApiResult;
import com.lovcreate.api.bean.request.UserRequest;
import com.lovcreate.api.bean.response.UserResponse;
import com.lovcreate.api.service.UserService;
import com.lovcreate.mgt.response.BaseResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by DuChuanLei on 2017/6/28
 */
@Controller
@RequestMapping("/user")
public class UserController extends AbstractController {
    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(UserController.class);

    @Resource
    UserService userService;

    @RequestMapping("/insert")
    @ResponseBody
    public BaseResponse insert(UserRequest userRequest) {

        userService.insert(userRequest);

        return success("kkkkk");
    }

    @RequestMapping(value = "/login")
    public BaseResponse login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        try {
            SecurityUtils.getSubject().login(new UsernamePasswordToken(userName, password));
        } catch (UnknownAccountException | IncorrectCredentialsException e) {
            logger.info("用户名:{}", userName);
            return failure("用户名/密码错误");
        } catch (AuthenticationException e) {
            logger.info("用户名:{}", userName);
            return failure("其他错误");
        }
        ApiResult<UserResponse> result = userService.checkLogin(userName, password);
        if (result.getCode() != 0) {
            return failure(result.getMessage());
        }
        return success("登录成功", result.getObject());
    }
}
