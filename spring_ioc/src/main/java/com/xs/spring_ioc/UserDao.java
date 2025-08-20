package com.xs.spring_ioc;

public class UserDao implements IUserDao{

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
