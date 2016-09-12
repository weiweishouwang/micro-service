package com.zhw.ms.demo.api;

import com.zhw.ms.commons.bean.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

public interface DemoAPI {

    @RequestMapping(value = "/getAdmin", method = RequestMethod.GET)
    public Result<Object> getAdmin(@RequestParam("id") Integer id) ;

}
