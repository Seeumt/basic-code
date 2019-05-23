package cn.itcast.day04.May2201demo;

import java.sql.SQLOutput;

/**
 * @author RX
 * final 可以用来修饰一个类
 * final 可以用来修饰一个方法
 * final 可以用来修饰一个局部变量
 * final 可以用来修饰一个成员变量
 *
 */
public class Finaldemo01 {
    public static void main(String[] args) {
        Studentdemo06 stu1 = new Studentdemo06("哈哈");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1=new Studentdemo06("嘻嘻");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        System.out.println("=============================");
        final Studentdemo06 stu2 = new Studentdemo06("呼呼");
        System.out.println(stu2.getName());
        //stu2 = new Studentdemo06("啦啦");
        //地址值虽然不能变了，但是可以改变，但是对象属性可以改变
        stu2.setName("嘟嘟");
        System.out.println(stu2.getName());
    }

}
