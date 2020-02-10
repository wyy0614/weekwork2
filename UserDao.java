package com.itdr.dao;

import com.itdr.pojo.Users;
import com.itdr.pojo.bo.UserRowMapper;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //用户登陆
    public String selectByUsernameAndPassword(String username, String password){
        String sql = "select username from users where username=? and password=?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, username, password);
        for (Map<String, Object> map:maps){
            for(String u : map.keySet()){
                return (String) map.get(u);
            }
        }
        return null;
    }

    //查询所有好友信息
    public List<Users> selectAll() {
        String sql = "select id,username,password,birthday,interest,phonenum,qq,creat_time,update_time from users";
        List<Users> li = jdbcTemplate.query(sql, new UserRowMapper());
        return li;
    }

    public int insertByUsernameAndBirthday(String username, Date birthday) {
        String sql = "insert into users values(null,?,null,?,null,null,null,null,null,0)";
        int i = jdbcTemplate.update(sql, username, birthday);
        return i ;
    }

    //将好友放入回收站中
    public  int inputHui(String username){
        String sql = "update users set huishouzhan = 1 where username = ? ";
        int i = jdbcTemplate.update(sql, username);
        return i;
    }

    //查询回收站好友信息
    public List<Users> selectAllHui() {
        String sql = "select id,username,password,birthday,interest,phonenum,qq,creat_time,update_time from users where huishouzhan = 1";
        List<Users> li = jdbcTemplate.query(sql, new UserRowMapper());
        return li;
    }

    //清空回收站
    public int deleteFriend(){
        String sql = "delete from users where huishouzhan = 1";
        int i = jdbcTemplate.update(sql);
        return i;
    }
}
