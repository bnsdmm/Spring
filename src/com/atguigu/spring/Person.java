package com.atguigu.spring;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sayHello() {
        System.out.println("My Name Is " + name);
    }
}
