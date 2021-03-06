package com.zhw.ms.middleware.db;

import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/5/10 0010.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Transactional(readOnly = true)
public @interface SlaverDataSource {
}
