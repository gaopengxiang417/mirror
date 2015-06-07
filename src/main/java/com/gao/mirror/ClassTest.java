package com.gao.mirror;

import net.vidageek.mirror.dsl.Mirror;

/**
 * User: wangchen
 * Date: 15/6/7
 * Time: 13:45
 * 用来测试对于class的操作反射工具
 */
public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> aClass = new Mirror().reflectClass("java.lang.String");

        System.out.println(aClass.getName());

        //其实底层实现也是基于反射的基本方法类实现的
        //等价于下面的代码逻辑
        Class<?> aClass1 = Class.forName("java.lang.String", false, null);

    }
}
