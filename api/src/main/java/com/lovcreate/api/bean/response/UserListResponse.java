/*
  Copyright (c) 2017, lovcreate.com. All rights reserved.
*/
package com.lovcreate.api.bean.response;

import java.io.Serializable;

/**
 * Created by DuChuanLei on 2017/7/10
 */
public class UserListResponse implements Serializable {

    private UserResponse userResponse;

    public UserResponse getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(UserResponse userResponse) {
        this.userResponse = userResponse;
    }
}
