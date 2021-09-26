package com.projectDemo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Cjl
 * @date 2021/7/1 16:57
 */

public class User implements Serializable {
    private String uid;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;
    private Date createTime;
    private Date updateTime;

    public User() {
    }

    public User(String uid, String username, String password, Integer age, Integer gender, Date createTime, Date updateTime) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
