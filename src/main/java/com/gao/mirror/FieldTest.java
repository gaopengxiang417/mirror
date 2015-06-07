package com.gao.mirror;

import net.vidageek.mirror.dsl.Mirror;
import net.vidageek.mirror.list.dsl.MirrorList;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * User: wangchen
 * Date: 15/6/7
 * Time: 13:55
 * 测试field的类反射
 */
public class FieldTest {
    public static void main(String[] args) throws IllegalAccessException {

        Student student = new Student();
        student.setAge(22);
        student.setBirthday(new Date());
        student.setName("hello test");
        //首先获取一个域

        Field age = new Mirror().on(Student.class).reflect().field("age");
        age.setAccessible(true);
        System.out.println(age.getInt(student));
        age.setAccessible(false);

        //获取所有的域
        MirrorList<Field> fields = new Mirror().on(Student.class).reflectAll().fields();

        for (Field field : fields) {

            field.setAccessible(true);
            System.out.println(field.get(student));
            field.setAccessible(false);
        }

        //通过工具设置一些值
        new Mirror().on(Student.class).set().field("test").withValue(988);
        new Mirror().on(student).set().field("name").withValue("chaged name");

        System.out.println(student.test);
        System.out.println(student.getName());

        //通过工具获取一些值
        Object test = new Mirror().on(Student.class).get().field("test");
        Object age1 = new Mirror().on(student).get().field("age");

        System.out.println(test);
        System.out.println(age1);

    }
}
