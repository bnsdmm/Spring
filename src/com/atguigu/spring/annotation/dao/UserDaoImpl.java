package com.atguigu.spring.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void uerAdd() {
        System.out.println("useradd");
    }
}
