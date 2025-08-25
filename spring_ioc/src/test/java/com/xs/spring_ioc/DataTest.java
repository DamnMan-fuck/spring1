package com.xs.spring_ioc;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

public class DataTest {
    @Test
    public void testC3P0() throws Exception{
        //创建c3p0数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        //获取资源
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    public void testDruid() throws Exception{
        //创建druid数据源
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //获取资源
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void testProperties() throws Exception{
        //使用properties配置文件替代
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String username = rb.getString("jdbc.uername");
        String password = rb.getString("jdbc.password");

        ComboPooledDataSource cpd = new ComboPooledDataSource();
        cpd.setDriverClass(driver);
        cpd.setJdbcUrl(url);
        cpd.setUser(username);
        cpd.setPassword(password);

        Connection connection = cpd.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void testSpring() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        DataSource dataSource = context.getBean(DataSource.class);

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
