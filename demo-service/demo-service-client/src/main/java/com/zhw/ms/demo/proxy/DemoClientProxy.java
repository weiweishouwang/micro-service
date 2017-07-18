package com.zhw.ms.demo.proxy;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import com.zhw.ms.base.proxy.BaseClientProxy;
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
public class DemoClientProxy extends BaseClientProxy implements DemoAPI {
    @Autowired
    private DemoClient demoClient;


    @Override
    @HystrixCommand(fallbackMethod = "getAdminFallback")
    public Result<Object> getAdmin(Long id) {
        return demoClient.getAdmin(id);
    }

    @HystrixCommand(fallbackMethod = "getAdminFallback")
    public Future<Result<Object>> getAdminAsync(Long id) {
        return new AsyncResult<Result<Object>>() {
            @Override
            public Result<Object> invoke() {
                return demoClient.getAdmin(id);
            }
        };
    }

    public Result<Object> getAdminFallback(Long id, Throwable t) {
        return backFallback(t);
    }
}
