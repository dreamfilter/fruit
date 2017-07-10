package com.lovcreate.service.dao;

import com.lovcreate.api.bean.request.UserRequest;
import org.springframework.stereotype.Repository;

/**
 * Created by DuChuanLei on 2017/6/28
 */
@Repository
public interface UserMapper {
    Integer insert(UserRequest userRequest);
}
