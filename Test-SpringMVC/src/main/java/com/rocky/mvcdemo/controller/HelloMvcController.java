package com.rocky.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luoqi3 on 2017/11/14.
 */
@Controller
@RequestMapping("/hello")
public class HelloMvcController {

    //跳转到home.jsp页面
    @RequestMapping("/mvc")
    public String hellocMvc(){
        return "home";
    }

}
