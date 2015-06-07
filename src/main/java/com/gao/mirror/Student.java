package com.gao.mirror;

import java.util.Date;

/**
 * User: wangchen
 * Date: 15/6/7
 * Time: 13:55
 */
public class Student {

    /**
     * 学生名字
     */
    private String name;

    /**
     * 学生的年龄
     */
    private int age;

    /**
     * 学生的出生日期
     */
    private Date birthday;

    /**
     * 测试字段
     */
    public static int test;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int renameTest(int a) {
        test = 998;
        return a;
    }
}
