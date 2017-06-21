package com.test.SpringMybatis.controller;

import com.test.SpringMybatis.bean.User;
import com.test.SpringMybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by root on 2017/6/21.
 */
@RestController
@RequestMapping({"/home"})
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/user")
    @ResponseBody

    public String user() {
        User user = userMapper.findUserByName("王伟");
        return user.getName() + "-----" + user.getAge();
    }
}
