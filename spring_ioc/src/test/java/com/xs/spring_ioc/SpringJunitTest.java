package com.xs.spring_ioc;

import com.xs.spring_ioc.config.SpringConfiguration;
import com.xs.spring_ioc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:application.xml")
@ContextConfiguration(classes = SpringConfiguration.class)
public class SpringJunitTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() throws Exception{
        userService.save();
    }
}
