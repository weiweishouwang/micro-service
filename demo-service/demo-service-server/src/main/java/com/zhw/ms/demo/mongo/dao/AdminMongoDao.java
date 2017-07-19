package com.zhw.ms.demo.mongo.dao;

import com.zhw.ms.demo.entity.Admin;
import com.zhw.ms.demo.entity.AdminExample;
import com.zhw.ms.middleware.mongo.MongoDaoImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdminMongoDao extends MongoDaoImpl<Admin> {

}