package com.atguigu.spring.datasource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class TestDatasource {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DataSource dataSource = ctx.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());
    }
}
