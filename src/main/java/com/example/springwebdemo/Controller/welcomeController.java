package com.example.springwebdemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String Welcome(){
        return "Welcome to SpringBoot By CodeShark";
    }
}
