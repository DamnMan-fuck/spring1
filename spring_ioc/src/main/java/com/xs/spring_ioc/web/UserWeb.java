package com.xs.spring_ioc.web;

import com.xs.spring_ioc.config.SpringConfiguration;
import com.xs.spring_ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserWeb {
    //使用xml配置文件测试
    /*public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }*/

    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
