package com.zhw.ms.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;


/**
 * 控制层基类
 * Created by ZHW on 2015/5/11.
 */
public abstract class BaseController {

    private static final Logger logger = LoggerFactory
            .getLogger(BaseController.class);

    public static String SUCCESS = "success";

    public static String ERROR = "error";

}
