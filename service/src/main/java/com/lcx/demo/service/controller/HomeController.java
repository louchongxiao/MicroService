package com.lcx.demo.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "classpath:/html/websocket";
    }
}
