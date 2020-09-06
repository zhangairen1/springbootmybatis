package com.atguigu;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {



    @Autowired
    private UserService userService;



    @Test
    public void  testFindAll() {
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

         @Autowired
         DataSource dataSource;

        @Test
       public void  testDataSource(){

            //class com.zaxxer.hikari.HikariDataSource  springboot框架默认继承数据源，性能好
            System.out.println(dataSource.getClass());

            //class com.zaxxer.hikari.HikariDataSource
        }




}
