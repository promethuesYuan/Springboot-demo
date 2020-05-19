package com.promethuesYuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String toIndex(){
        return "ems/login";
    }

    @GetMapping("/toRegist")
    public String toRegist(){
        return "/ems/regist";
    }

    @GetMapping("/toSave")
    public String toSave(){
        return "/ems/addEmp";
    }
}
