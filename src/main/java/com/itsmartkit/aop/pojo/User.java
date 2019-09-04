package com.itsmartkit.aop.pojo;

import java.io.Serializable;

/**
 * @author cyj
 * @name User
 * @description TODO 用户类
 * @date 2019/9/3 15:06
 * Version 1.0
 */
public class User implements Serializable {

    private Integer id;

    private String userName;

    private String realName;

    private String password;

    public User(Integer id, String userName, String realName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.realName = realName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
