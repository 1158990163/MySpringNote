package com.lty.AOC.anno;


import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("aopage")
public class AOPage {
    public void add(){
        System.out.println("add>>>>>");
    }
}
