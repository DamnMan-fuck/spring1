package com.xs.spring_ioc.service;

import com.xs.spring_ioc.User;
import com.xs.spring_ioc.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Properties;

//注解替代<bean id="userService"  class="com.xs.spring_ioc.service.UserService">
//@Component("userService")
@Service("userService")
public class UserService implements IUserService {

    @Value("${jdbc.driver}")  //测试@value
    private String  username;

    //替代<property name="userDao" ref="userDao"></property>
    //@Autowired
    //@Qualifier("userDao")
    @Resource(name = "userDao")
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
        System.out.println(username);
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
    private Map<String, User> map;
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
