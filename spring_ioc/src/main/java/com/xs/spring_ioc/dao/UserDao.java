package com.xs.spring_ioc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//替代<bean id="userDao"  class="com.xs.spring_ioc.dao.UserDao"></bean>
//@Component("userDao")
@Repository("userDao")
public class UserDao implements IUserDao {
    public UserDao() {
        System.out.println("UserDao启动");
    }

    public void save() {
        System.out.println("启动成功");
    }

    public void init() {
        System.out.println("初始化方法");
    }

    public void destroy() {
        System.out.println("销毁方法");
    }
}
