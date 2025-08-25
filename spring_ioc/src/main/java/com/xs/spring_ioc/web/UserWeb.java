package com.xs.spring_ioc.web;

import com.xs.spring_ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserWeb {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
