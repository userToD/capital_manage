package com.yan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/")
    public String welcome(){
        return "欢迎光临！";
    }

}
