package com.zhw.ms.demo.service;

import com.zhw.ms.demo.entity.Admin;
import com.zhw.ms.demo.persistence.AdminMapper;
import com.zhw.ms.middleware.db.SlaverDataSource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by ZHW on 2015/5/8.
 */
@Service
public class DemoService {
    @Autowired
    private AdminMapper adminMapper;

    @SlaverDataSource
    public Admin getAdmin(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }

}
