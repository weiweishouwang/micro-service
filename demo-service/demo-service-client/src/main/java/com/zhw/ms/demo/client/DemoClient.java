package com.zhw.ms.demo.client;

import com.zhw.ms.demo.api.DemoAPI;
import com.zhw.ms.demo.fallback.DemoClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "demo-service"/*, fallback = DemoClientFallback.class*/)
public interface DemoClient extends DemoAPI {

}

