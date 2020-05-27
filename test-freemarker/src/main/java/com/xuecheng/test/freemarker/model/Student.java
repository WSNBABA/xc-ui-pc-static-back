package com.xuecheng.test.freemarker.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @AUTHOR LZG
 * @DATE 2020/5/17 17:54
 * @VERSION 1.0
 */
@Data
@ToString
public class Student {
    private String name;
    private int age;
    private Date birthday;
    private double money;
    private List<Student> friends;
    private Student bestFriend;
}
