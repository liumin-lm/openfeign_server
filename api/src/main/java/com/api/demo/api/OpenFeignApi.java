package com.api.demo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author liumin
 * @Date 2023/5/20 下午9:42
 * @Description
 */
@FeignClient(name = "feignServer",url = "${open.feign.url.api:http://127.0.0.1:8082/}")
public interface OpenFeignApi {


    @PostMapping("testOpenFeignController/testAopRpc")
    String testAopRpc( @RequestParam("student") String student);
}

