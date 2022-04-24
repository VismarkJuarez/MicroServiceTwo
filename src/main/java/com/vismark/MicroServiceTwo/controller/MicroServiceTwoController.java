package com.vismark.MicroServiceTwo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServiceTwoController {

    @RequestMapping("/")
    public String greeting(){
        return "hello!";
    }

}
