package com.atguigu.spring.lifecycle;

public class Car {
    private String brand;
    private Double price;

    public Car() {
        System.out.println("1.调用构造器创建bean对象");
    }

    public void init(){
        System.out.println("3.调用初始化方法");
    }

    public void destory(){
        System.out.println("5.调用销毁方法");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("2.调用set方法给对象属性赋值");
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
