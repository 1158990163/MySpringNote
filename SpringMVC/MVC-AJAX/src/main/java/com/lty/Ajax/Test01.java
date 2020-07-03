package com.lty.Ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01 {

    @RequestMapping("/Ajax")
    public String test01(){
        return "AJAX";
    }


    @RequestMapping("/Ajax01")
    @ResponseBody
    public String test02(){
        return "AJAX";
    }

}
