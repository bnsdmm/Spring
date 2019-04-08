package com.atguigu.spring.autowire;

public class Car {
    private String bread;
    private String name;

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bread='" + bread + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
