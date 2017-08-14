package com.example.controller;

import com.example.config.ConfigJdbcBean;
import com.example.domain.User;
import com.example.service.mysql.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    /*方式一*/
//	@Value("${spring.datasource.url}")
//	private String jdbc_test;

    /*方式二*/
    @Autowired
    private ConfigJdbcBean configJdbcBean;

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public void sayHello() {
        System.out.println("hello spring boot===" + configJdbcBean.getUsername());
    }

    @RequestMapping("/hello/1")
    public void insertUser() {
        List<User> list = userService.showUserById(1);
        System.out.println(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }


}
