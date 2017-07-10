/*
 * Copyright (c) 2017, lovcreate.com. All rights reserved.
 */
package com.lovcreate.mgt.controller;

import com.lovcreate.api.bean.request.UserRequest;
import com.lovcreate.api.service.UserService;
import com.lovcreate.mgt.response.BaseResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @Resource
    UserService userService;

    @RequestMapping("/insert")
    @ResponseBody
    public BaseResponse insert(UserRequest userRequest) {

        userService.insert(userRequest);

        return success("kkkkk");
    }

    public static void main(String[] args) {
        List list= new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator it = list.iterator(); // 获得一个迭代子
        System.out.println(it);
　　　　while(it.hasNext()) {
　　　　　　Object obj = it.next(); // 得到下一个元素
            System.out.println(obj);
　　　　}

    }
}
