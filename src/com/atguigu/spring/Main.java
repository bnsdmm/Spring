package com.atguigu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/applicationContext.xml");
        Person person = ctx.getBean("person", Person.class);
        person.sayHello();
    }
}
