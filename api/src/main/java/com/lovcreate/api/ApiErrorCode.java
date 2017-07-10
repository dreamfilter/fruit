package com.lovcreate.api;

/**
 * Created by dennis on 2017/2/7.
 * API 统一返回CODE 按照模块分类 用户USER_+"业务类型"
 * 根据业务类型 code 首位改变例 公共模块 2000起
 */
public enum ApiErrorCode {

    MANAGER_CHECK_NAME_FAILED("1000"),
    MANAGER_CHECK_LOGIN_FAILED("1001");

    private String code;

    ApiErrorCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
