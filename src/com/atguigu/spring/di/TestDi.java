package com.atguigu.spring.di;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {
    ApplicationContext applicationContext = null;

    @Before
    public void createApplicationContext() {
        applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
    }

    @org.junit.Test
    public void testSet() {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        Car car1 = applicationContext.getBean("car1", Car.class);
        Car car4 = applicationContext.getBean("car4", Car.class);
        System.out.println(car1);
        System.out.println(car4);
    }

    @Test
    public void testConstructor() {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        Car car2 = applicationContext.getBean("car2", Car.class);
        Car car3 = applicationContext.getBean("car3", Car.class);
        Car car5 = applicationContext.getBean("car5", Car.class);
        Person person1 = applicationContext.getBean("Person1", Person.class);
        Person person2 = applicationContext.getBean("Person2", Person.class);
        PersonList personList = applicationContext.getBean("PersonList", PersonList.class);
        PersonMap personMap = applicationContext.getBean("PersonMap", PersonMap.class);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car5);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(personList);
        System.out.println(personMap);
    }

    @Test
    public void testFactoryBean() {
        Car carFactoryBean = applicationContext.getBean("carFactoryBean", Car.class);
        System.out.println(carFactoryBean);
    }

    @Test
    public void testRelation() {
        Car carRelation = applicationContext.getBean("relation2", Car.class);
        System.out.println(carRelation);
    }

}
