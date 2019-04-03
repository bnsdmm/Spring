package com.atguigu.spring.di;

import java.util.List;

public class PersonList {
    private String name;
    private List<Car> carList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "PersonList{" +
                "name='" + name + '\'' +
                ", carList=" + carList +
                '}';
    }
}
