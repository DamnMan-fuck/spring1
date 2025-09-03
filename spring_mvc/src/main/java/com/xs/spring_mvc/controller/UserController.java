package com.xs.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/user",method= RequestMethod.GET,params = {"username"})//放在类上，请求url第一级目录，若此处不写，就相当于根目录
public class UserController {
    @RequestMapping("/quick")//请求映射
    public String save(){
        System.out.println("controller save");
        //return "forward:/success.jsp";//转发前缀，默认为forward,可省略
        return "redirect:/success.jsp";//改成redirect重定向前缀,访问时会重定向到success.jsp
    }
}

