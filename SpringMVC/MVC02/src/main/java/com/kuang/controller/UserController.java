package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @RequestMapping(value = "/jaaa")
//    @ResponseBody             //加注解后不通过视图解析器,直接返回字符串
    public String json1(){
        System.out.println("===================================");

        User user = new User("jack",12,"男");

        return "hello";
    }
}
