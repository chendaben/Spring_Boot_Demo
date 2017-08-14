package com.example.service.mysql;

import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/14.
 */
@Service
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> showUserById(Integer id) {
        List<User> list = jdbcTemplate.query("select * from User where id = " + id, new BeanPropertyRowMapper<User>(User.class));
        return list;
    }
}
