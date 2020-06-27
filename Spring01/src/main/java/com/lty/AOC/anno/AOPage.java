package com.lty.AOC.anno;


import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("aopage")
public class AOPage {
    public void add() {
        System.out.println("add>>>>>");
    }

    @Override
    public int hashCode() {
        return 0;
//        352102761     10
//        352102752     1
//        352102751     0
    }
}
