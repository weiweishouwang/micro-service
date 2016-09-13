package com.zhw.ms.demo.rest;

import com.zhw.ms.commons.bean.Result;
import com.zhw.ms.commons.bean.ResultEnum;
import com.zhw.ms.demo.api.DemoAPI;
import com.zhw.ms.demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE
        , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DemoRest implements DemoAPI {
    static final Logger logger = LoggerFactory
            .getLogger(DemoRest.class);

    @Autowired
    private DemoService demoService;

    @Override
    public Result<Object> getAdmin(@RequestParam("id") Integer id) {
        logger.info("start");
        Result<Object> result = new Result<>();
        result.setRetCode(ResultEnum.SUCCESS.getCode());
        result.setRetMsg(ResultEnum.SUCCESS.getMessage());
        result.setData(demoService.getAdmin(id));
        return result;
    }

}
