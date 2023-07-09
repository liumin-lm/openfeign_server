package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author liumin
 * @Date 2023/4/27 下午2:13
 * @Description
 */
@RestController
@RequestMapping(value = "/test")
public class TestAop {


    /*get-----------------------------------------------------------------------*/
    @GetMapping("/testAopGet")
    public void testAopGet(){
        System.out.println("get");
    }



}

