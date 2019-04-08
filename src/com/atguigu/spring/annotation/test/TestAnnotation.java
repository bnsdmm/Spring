package com.atguigu.spring.annotation.test;

import com.atguigu.spring.annotation.controller.UserController;
import com.atguigu.spring.annotation.dao.UserDao;
import com.atguigu.spring.annotation.dao.UserDaoImpl;
import com.atguigu.spring.annotation.service.UserService;
import com.atguigu.spring.annotation.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    @Test
    public void testAnnotation() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserController userController = ctx.getBean("userController", UserController.class);
        System.out.println(userController);
        userController.regist();
//        UserDao userDao = ctx.getBean("userDaoImpl", UserDaoImpl.class);
//        System.out.println(userDao);
//        UserService userService = ctx.getBean("userserviceImpl", UserServiceImpl.class);
//        System.out.println(userService);
    }
}
