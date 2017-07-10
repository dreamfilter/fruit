package com.lovcreate.api.service;

import com.lovcreate.api.ApiResult;
import com.lovcreate.api.bean.request.UserRequest;
import com.lovcreate.api.bean.response.UserResponse;

/**
 * Created by DuChuanLei on 2017/6/28
 */
public interface UserService {
    Integer insert(UserRequest userRequest);

    ApiResult<UserResponse> checkLogin(String userName, String password);
}
