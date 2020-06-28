package com.kuang.controller;


import com.sun.org.apache.xpath.internal.operations.Mod;
import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Encoding {
    @PostMapping("/encod")
    public String test1(@RequestParam("username") String name, Model model) {
        model.addAttribute("args", name);
        System.out.println(name);
        return "hello";
    }
}
