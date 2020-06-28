package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFull {

    @RequestMapping(value = "/Rest/{a}/{b}",method = RequestMethod.GET)
    public String test1(@PathVariable int a, @PathVariable int b, Model model) {
        int s = a + b;
        model.addAttribute("args", "GET结果是" + s);
        return "Rest";
    }
    @PostMapping(value = "/Rest/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model) {
        int s = a + b;
        model.addAttribute("args", "POST结果是" + s);
        return "Rest";
    }
}
