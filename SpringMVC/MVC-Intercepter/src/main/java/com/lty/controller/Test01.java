package com.lty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01 {

    @RequestMapping("/test01")
    public String test01(){
        System.out.println("hello");
        return "hello";
    }
}
