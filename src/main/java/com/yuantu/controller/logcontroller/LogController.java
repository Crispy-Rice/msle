package com.yuantu.controller.logcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/log")
public class LogController {
    @RequestMapping("/loglog")
    public String loglog(){
        return "login";
    }
}
