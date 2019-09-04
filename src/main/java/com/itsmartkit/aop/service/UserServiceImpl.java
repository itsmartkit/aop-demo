package com.itsmartkit.aop.service;

import com.itsmartkit.aop.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cyj
 * @name UserServiceImpl
 * @description TODO
 * @date 2019/9/3 15:03
 * Version 1.0
 */
@Service
public class UserServiceImpl {
    List<User> userList = new ArrayList<>(4);

    public UserServiceImpl() {
        userList.add(new User(1,"zhangsan","张三","123456"));
        userList.add(new User(2,"lisi","李四","123456"));
        userList.add(new User(3,"wangwu","王五","123456"));
        userList.add(new User(4,"zhangfei","张飞","123456"));
    }

    public User getUserByIdx(int idx) {
        return userList.get(idx);
    }

    public List queryByRealName(String realName) {
        List<User> list = new ArrayList<>(4);
        for (User user : userList) {
            if (realName.equals(user.getRealName())|| user.getRealName().indexOf(realName) > -1) {
                list.add(user);
            }
        }
        return list;
    }
}
