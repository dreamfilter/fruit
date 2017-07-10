/*
 * Copyright (c) 2017, lovcreate.com. All rights reserved.
 */
package com.lovcreate.api.bean.request;

import java.io.Serializable;

/**
 * Created by DuChuanLei on 2017/6/28
 */
public class UserRequest implements Serializable{

    private String name;

    private Integer age;

    private Integer sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
