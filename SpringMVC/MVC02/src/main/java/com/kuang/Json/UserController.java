package com.kuang.Json;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController  只返回字符串，不走视图解析器
@Controller
public class UserController {

    @RequestMapping(value = "/jaaa")
    @ResponseBody             //加注解后不通过视图解析器,直接返回字符串（配合Controller使用）
    public String test1() throws JsonProcessingException {
        System.out.println("===================================");

        User user = new User("jack", 12, "男");
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(user);
//        return user.toString(); 返回的是一个对象的信息
        return s;//将一个对象信息变为json的格式转为String形式
    }
}
