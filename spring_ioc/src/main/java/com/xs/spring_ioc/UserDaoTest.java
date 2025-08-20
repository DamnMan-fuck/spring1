package com.xs.spring_ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xs.spring_ioc.IUserDao;

public class UserDaoTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userdao1=(IUserDao) ioc.getBean("userDao");
        IUserDao userdao2=(IUserDao) ioc.getBean("userDao");
        System.out.println(userdao1);
        System.out.println(userdao2);

        ioc.close();
    }
}
