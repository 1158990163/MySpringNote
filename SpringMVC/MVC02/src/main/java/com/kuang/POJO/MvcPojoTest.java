package com.kuang.POJO;


import com.kuang.POJO.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcPojoTest {

    //会自动将表单里的数据按照对应的名称映射到User对象里的各个属性字段内中，支持联级映射
    @RequestMapping("/MvcPojo")
    public String test(User user){
        System.out.println("MvcPojoTest :" + user);
        return "success";
    }
}
