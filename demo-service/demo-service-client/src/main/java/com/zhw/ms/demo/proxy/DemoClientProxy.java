package com.zhw.ms.demo.proxy;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import com.zhw.ms.commons.bean.Result;
import com.zhw.ms.demo.api.DemoAPI;
import com.zhw.ms.demo.client.DemoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.Future;

@Service
public class DemoClientProxy implements DemoAPI {
    private static final Logger logger = LoggerFactory
            .getLogger(DemoClientProxy.class);

    @Autowired
    private DemoClient demoClient;


    @Override
    @HystrixCommand(fallbackMethod = "getAdminFallback")
    public Result<Object> getAdmin(Integer id) {
        return demoClient.getAdmin(id);
    }

    public Result<Object> getAdminFallback(Integer id, Throwable t) {
        logger.error(t.getMessage(), t);
        return null;
    }
}
