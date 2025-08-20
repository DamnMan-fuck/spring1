package com.xs.spring_ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService=(IUserService) ioc.getBean("userService");
        userService.save();
    }
}
