package com.kuang.Rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

    private static final String SUCCESS = "success";

    @RequestMapping(value = "/RestTest/{id}", method = RequestMethod.GET)
    public String TestRestGet(@PathVariable("id") int id) {
        System.out.println("TestRestGet is " + SUCCESS);
        return SUCCESS;
    }

    @RequestMapping(value = "/RestTest", method = RequestMethod.POST)
    public String TestRestPost() {
        System.out.println("TestRestPost is " + SUCCESS);
        return SUCCESS;
    }

    @RequestMapping(value = "/RestTest/{id}", method = RequestMethod.PUT)
    public String TestRestPut(@PathVariable("id") int id) {
        System.out.println("TestRestPut is " + SUCCESS);
        return SUCCESS;
    }

    @RequestMapping(value = "/RestTest/{id}", method = RequestMethod.DELETE)
    public String TestRestDelete(@PathVariable("id") int id) {
        System.out.println("TestRestDelete is " + SUCCESS);
        return SUCCESS;
    }
}
