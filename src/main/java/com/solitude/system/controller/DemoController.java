package com.solitude.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "demo")
public class DemoController {

    @RequestMapping(value = "vion.do")
    public String vion(){
        return "system/index";
    }

    @RequestMapping(value = "index.do")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "test.do")
    public String test(){
        return "index";
    }

}
