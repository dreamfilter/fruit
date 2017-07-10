package com.lovcreate.mgt.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by dennis on 2017/2/23.
 */
public class ParamsInterceptor extends HandlerInterceptorAdapter {

    private final static Logger logger = LoggerFactory.getLogger(ParamsInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws
            Exception {

//        logger.info("请求接口:{},请求header:{},请求参数:{}", request.getRequestURI(), request.getHeader("token"),
//                JsonUtil.encode(request.getParameterMap()));

        return super.preHandle(request, response, handler);
    }

}
