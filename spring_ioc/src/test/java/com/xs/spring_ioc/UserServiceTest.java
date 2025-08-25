package com.xs.spring_ioc;

import com.xs.spring_ioc.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserServiceTest {
    public static void main(String[] args) {
        ApplicationContext ioc = new FileSystemXmlApplicationContext("applicationContext.xml");
        IUserService userService=(IUserService) ioc.getBean("userService");
        userService.save();
    }
}
