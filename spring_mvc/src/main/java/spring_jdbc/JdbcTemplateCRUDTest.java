package spring_jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Component
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class JdbcTemplateCRUDTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    //查询行数
    public void testQueryCount() {
        Long count=jdbcTemplate.queryForObject("select count(*) from account",Long.class);
        System.out.println(count);
    }


    @Test
    //查询单个对象
    public void testQueryOne() {
        Account account=jdbcTemplate.queryForObject("select * from account where name = ?",new BeanPropertyRowMapper<Account>(Account.class),"xxl");
        System.out.println(account);
    }

    @Test
    //查询多个对象
    public void testQueryAll() {
        List<Account> accountList = jdbcTemplate.query("select * from account",new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(accountList);
    }

    @Test
    //更新(修改)操作
    public void testUpdate() {
        String sql = "update account set money = 500 where name = ?";
        jdbcTemplate.update(sql, "xiaoming");
    }

    @Test
    //删除操作
    public void testDelete() {
        String sql = "delete from account where name = ?";
        jdbcTemplate.update(sql, "xiaoming");
    }
}
