package com.gao.mirror;

import net.vidageek.mirror.dsl.Mirror;

import java.util.Date;

/**
 * User: wangchen
 * Date: 15/6/7
 * Time: 14:17
 * 测试method的工具类
 */
public class MethodTest {
    public static void main(String[] args) {



        Student student = new Student();
        student.setAge(22);
        student.setBirthday(new Date());
        student.setName("hello test");

        //调用静态方法
        Object renameTest = new Mirror().on(Student.class).invoke().method("renameTest").withArgs(12);
        System.out.println(renameTest);

        //调用实例方法
        Object getBirthday = new Mirror().on(student).invoke().method("getBirthday").withoutArgs();
        System.out.println(getBirthday);

        //调用set方法
        Object age = new Mirror().on(student).invoke().getterFor("age");
        System.out.println(age);

        //调用set方法
        new Mirror().on(student).invoke().setterFor("age").withValue(98);
        System.out.println(student.getAge());
    }
}
