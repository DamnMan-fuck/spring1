package com.xs.spring_mvc.service;

import com.xs.spring_mvc.dao.UserDao;

public class UserService implements IUserService {

    private UserDao userDao;
    /*set方法*/
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save() {
        System.out.println("save");
        //System.out.println(name+":"+age);
        /*System.out.println(list);
        System.out.println(map);
        System.out.println(properties);*/
        //System.out.println(username);
    }
}
