package com.lovcreate.mgt.controller;

import com.lovcreate.mgt.response.BaseResponse;

/**
 * 文件名： 创建人：高博 创建日期 2016-12-20 描 述：控制器抽象类基类 版本号： 1.0
 **/
public class AbstractController {

    public BaseResponse success(String message, Object data) {

        return new BaseResponse(1, message, data);
    }

    public BaseResponse success(String message) {

        return new BaseResponse(1, message);
    }

    public BaseResponse failure(String message, Object data) {

        return new BaseResponse(0, message, data);
    }

    public BaseResponse failure(String message) {

        return new BaseResponse(0, message);
    }

    public BaseResponse tokenFailure(String message) {

        return new BaseResponse(3, message);
    }

}
