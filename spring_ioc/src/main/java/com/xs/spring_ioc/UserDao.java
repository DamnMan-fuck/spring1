package com.xs.spring_ioc;

public class UserDao implements IUserDao{
    public void save() {
        System.out.println("启动成功");
    }
}
