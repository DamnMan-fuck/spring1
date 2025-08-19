package com.xs.spring_ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xs.spring_ioc.IUserDao;

public class UserDaoTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userdao=(IUserDao) ioc.getBean("userDao");
        userdao.save();
    }
}
