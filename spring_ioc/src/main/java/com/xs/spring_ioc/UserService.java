package com.xs.spring_ioc;

import com.xs.spring_ioc.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserService implements IUserService {

    /*set方法*/
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save() {
        System.out.println("save");
        //System.out.println(name+":"+age);
        System.out.println(list);
        System.out.println(map);
        System.out.println(properties);
    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserService() {

    }

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private List<String> list;
    private Map<String,User> map;
    private Properties properties;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
