package com.lovcreate.mgt.response;

import com.lovcreate.api.utils.JsonUtil;

import java.util.List;

/**
 * 文件名 : 基础返回类 创建人： 高博 日期： 2016-12-12 描 述： 包含状态、版本、返回信息和返回数据 版本号： 1.0
 */
public class BaseResponse {

    private static final Double VERSION = 1.0;

    /**
     * 状态码 0-失败 1-成功
     */
    private int ret;

    /**
     * 版本号
     */
    private Double ver;

    /**
     * 返回信息,中文
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;

    public BaseResponse(int ret, String message, Object data) {
        this.ret = ret;
        this.ver = VERSION;
        this.message = message;

        if (data instanceof List) {
            CollectionResponse response = new CollectionResponse();
            response.setList((List) data);
            this.data = response;
        } else {
            this.data = data;
        }

    }

    public BaseResponse(int ret, String message) {
        this.ret = ret;
        this.ver = VERSION;
        this.message = message;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public static Double getVERSION() {
        return VERSION;
    }

    public Double getVer() {
        return ver;
    }

    public void setVer(Double ver) {
        this.ver = ver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BaseResponse() {

    }

    public class CollectionResponse {

        private List List;

        public java.util.List getList() {
            return List;
        }

        public void setList(java.util.List list) {
            List = list;
        }
    }

    public static void main(String[] args) {

        System.out.println(JsonUtil.encode(new BaseResponse(0, "查询成功")));
    }

}
