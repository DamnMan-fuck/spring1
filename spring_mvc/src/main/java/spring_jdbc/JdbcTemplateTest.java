package spring_jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

public class JdbcTemplateTest {
    @Test
    public void test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
        JdbcTemplate jdbcTemplate = app.getBean(JdbcTemplate.class);
        int row=jdbcTemplate.update("insert into account(name,money) values(?,?)", "xxl", 1000);
        System.out.println(row);
    }

    @Test
    //测试JdbcTemplateTest开发步骤
    public void test1() throws PropertyVetoException {
        //创建数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("231519149");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //设置数据源对象，知道数据库在哪儿
        jdbcTemplate.setDataSource(dataSource);

        //执行操作
        int row=jdbcTemplate.update("insert into account(name,money) values(?,?)", "xiaoming", 1000);
        System.out.println(row);
    }

}
