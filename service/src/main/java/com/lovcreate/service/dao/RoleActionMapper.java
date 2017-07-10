package com.lovcreate.service.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by DuChuanLei on 2017/7/10
 */
@Repository
public interface RoleActionMapper {

    List<Integer> selectActionIdByManager(String id);
}
