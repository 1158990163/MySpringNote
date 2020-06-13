package com.lty.Dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;


public class Autor {
    String Name;

    public void setName(String name) {
        Name = name;
    }

    public Autor() {
        System.out.println("执行构造方法");
    }

    public Autor(String name) {
        System.out.println("执行set方法");
        Name = name;
    }

    public void init(){
        System.out.println("执行初始化方法");
    }
    public void destory(){
        System.out.println("执行销毁方法");
    }

    public String getName() {
        return Name;
    }
}
