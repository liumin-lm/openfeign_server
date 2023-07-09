package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author liumin
 * @Date 2023/7/8 下午4:38
 * @Description
 */

@RestController
@RequestMapping(value = "/testOpenFeignController")
public class OpenFeignController {
    @PostMapping("/testAopRpc")
    public String testAopRpc( @RequestParam("student") String student){
        System.out.println("test");
        return student;
    }

    @GetMapping("/testAopRpc2")
    public void testAopRpc( ){
        System.out.println("test");
    }
}

