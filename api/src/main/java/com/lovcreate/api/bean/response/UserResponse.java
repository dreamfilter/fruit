/*
  Copyright (c) 2017, lovcreate.com. All rights reserved.
*/
package com.lovcreate.api.bean.response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DuChuanLei on 2017/7/10
 */
public class UserResponse implements Serializable {

    private String id;

    private String userName;

    private String password;

    private List<Integer> roleId;

    public List<Integer> getRoleId() {
        return roleId;
    }

    public void setRoleId(List<Integer> roleId) {
        this.roleId = roleId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
