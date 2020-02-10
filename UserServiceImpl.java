package com.itdr.service.impl;

import com.itdr.dao.UserDao;
import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public String selectByUsernameAndPassword(String username, String password) {
        String s = userDao.selectByUsernameAndPassword(username, password);
        return s;
    }

    @Override
    public List<Users> getAll() {
        List<Users> li = userDao.selectAll();
        return li;
    }

    @Override
    public int addOne(String username, Date birthday) {
        int i = userDao.insertByUsernameAndBirthday(username,birthday);
        return i;
    }

    @Override
    public int inputHui(String username) {
        int i = userDao.inputHui(username);
        return i;
    }

    @Override
    public List<Users> selectAllHui() {
        List<Users> users = userDao.selectAllHui();
        return users;
    }

    @Override
    public int deleteFriend() {
        int i = userDao.deleteFriend();
        return i;
    }

}
