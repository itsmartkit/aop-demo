package com.itsmartkit.aop.controller;

import com.itsmartkit.aop.annotation.ResultFiller;
import com.itsmartkit.aop.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cyj
 * @name DemoController
 * @description TODO
 * @date 2019/9/3 15:04
 * Version 1.0
 */

@RestController
@RequestMapping("/user")
public class DemoController {

    @Autowired
    private UserServiceImpl userService;

    @ResultFiller
    @RequestMapping("/get/{id}")
    public Object getUserByIdx(@PathVariable String id) {
        return userService.getUserByIdx(Integer.parseInt(id));
    }

    @ResultFiller
    @RequestMapping("/query")
    public Object queryByRealName(String name) {
        return userService.queryByRealName(name);
    }
}
