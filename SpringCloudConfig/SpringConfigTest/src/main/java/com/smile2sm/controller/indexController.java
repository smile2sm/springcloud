package com.smile2sm.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class indexController {

    @Value("${hello}")
    String helloStr;

    @RequestMapping("/")
    public String index(){
        System.out.println("读取到的配置为:" + helloStr);
        return "读取到的配置为:" + helloStr;
    }
}
