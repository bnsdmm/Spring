package com.atguigu.spring.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        Car car = ctx.getBean("beanLifecycle", Car.class);
        System.out.println("4.使用bean对象" + car);
        ctx.close();
    }
}
