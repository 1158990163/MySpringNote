package com.lty.AOC.anno;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect   //生成代理对象
public class AOPageProxy {

    @Pointcut("execution(* com.lty.AOC.anno.AOPage.add(..))")
    public void point() {
    }

    @Before("point()")
    public void before() {
        System.out.println("before+++++++++++++++");
    }

//    @After("execution(* com.lty.AOC.anno.AOPage.add(..))")
//    public void after() {
//        System.out.println("after+++++++++++++++");
//    }

    @After("execution(* com.lty.AOC.anno.AOPage.hashCode())")
    public void after(){
        System.out.println("HashCode前置执行");
    }

    @Around("execution(* com.lty.AOC.anno.AOPage.add(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        point.proceed();
        System.out.println("around+++++++++++++++");
    }


}
