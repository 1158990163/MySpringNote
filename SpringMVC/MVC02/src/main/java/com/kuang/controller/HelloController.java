package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping可以写在类上和方法上，具有一种父子关系

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("mvc","Hello,SpringMVC");
        return "hello";//会被视图解析器处理；
    }
}
