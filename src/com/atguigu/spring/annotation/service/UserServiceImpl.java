package com.atguigu.spring.annotation.service;

import com.atguigu.spring.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void handleAddUser() {
        userDao.uerAdd();
    }
}
