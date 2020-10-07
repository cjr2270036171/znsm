package com.znsm.znsm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @Controller
    @RequestMapping(value = "/")
    public class IndexController {
        @RequestMapping(value = "/")
        public String index(){
            return "/index";
        }
    }
}
