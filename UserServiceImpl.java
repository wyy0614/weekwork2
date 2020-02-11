package com.itdr.service.impl;

import com.itdr.dao.UserDao;
import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    //查询全部好友信息
    @Override
    public List<Users> getAll() {
        List<Users> li = userDao.selectAll();
        return li;
    }

    //增加一个好友
    @Override
    public int addOne(String username, Date birthday) {
        int i = userDao.insertByUsernameAndBirthday(username,birthday);
        return i;
    }

    //将好友放入回收站
    @Override
    public int inputHui(String username) {
        int i = userDao.inputHui(username);
        return i;
    }

    //查询回收站中的好友信息
    @Override
    public List<Users> selectAllHui() {
        List<Users> users = userDao.selectAllHui();
        return users;
    }

    //清空回收站
    @Override
    public int deleteFriend() {
        int i = userDao.deleteFriend();
        return i;
    }

    //登陆
    @Override
    public Users login(String username, String password) {
        //非空判断
        if (StringUtils.isEmpty(username)) {
            //错误
            return null;
        }
        if (StringUtils.isEmpty(password)) {
            //错误
            return null;

        }
        //查找用户是否存在
        Users u = userDao.selectByUsernameAndPassword(username,password);
        if( u == null){
            //错误
            return null;
        }
        return u;
    }

    //生日提醒
    @Override
    public List<Users> cc() {
        //创建空集合保存数据
        List<Users> liNew = new ArrayList<Users>();
        //查询所有好友
        List<Users> li = userDao.selectAll();
        //获取当前系统时间
        Calendar c = Calendar.getInstance();
        int i =c.get(Calendar.DAY_OF_MONTH);
        //遍历每个好友，看那个好友的生日在3天内
        for(Users users : li){
            Date birthDay = users.getBirthDay();
            Calendar c2 = Calendar.getInstance();
            c2.setTime(birthDay);
            int i2 = c2.get(Calendar.DAY_OF_MONTH);

            if((i2-i)<=3 && (i2-i)>= 0){
                liNew.add(users);
            }
        }
        return liNew;
    }

}
