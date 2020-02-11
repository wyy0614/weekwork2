package com.itdr.pojo.bo;

import com.itdr.pojo.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<Users> {
    @Override
    public Users mapRow(ResultSet resultSet, int i) throws SQLException {
        Users users = new Users();

        users.setId(resultSet.getInt("id"));
        users.setUserName(resultSet.getString("username"));
        users.setPassWord(resultSet.getString("password"));
//        users.setIamges(resultSet.getString("images"));
        users.setBirthDay(resultSet.getDate("birthday"));
        users.setStatus(resultSet.getInt("status"));
        users.setInterest(resultSet.getString("interest"));
        users.setPhoneNum(resultSet.getInt("phonenum"));
        users.setQq(resultSet.getInt("qq"));
        users.setCreatTime(resultSet.getDate("creat_time"));
        users.setUpdateTime(resultSet.getDate("update_time"));




        return users;
    }
}
