package com.itdr.service;

import com.itdr.pojo.Users;

import java.util.Date;
import java.util.List;

public interface UserService {
    String selectByUsernameAndPassword(String username, String password);
    List<Users> getAll();

    int addOne(String username, Date birthday);

    int inputHui(String username);

    List<Users> selectAllHui();

    int deleteFriend();
}
