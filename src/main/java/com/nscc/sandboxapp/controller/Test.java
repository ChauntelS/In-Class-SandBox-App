package com.nscc.sandboxapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testing")
public class Test {

    @GetMapping("/sayhello")
    public String SayHello(){
        return " Hello, welcome to my Spring App!";
    }

    @GetMapping("/goodbye")
    public String SayGoodbye(){
        return " Good bye, see you later.";
    }
}
