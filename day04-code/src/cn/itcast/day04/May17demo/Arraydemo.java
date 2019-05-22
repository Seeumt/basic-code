package cn.itcast.day04.May17demo;

import cn.itcast.day04.demo04.Person;

import java.sql.SQLOutput;

public class Arraydemo {
    public static void main(String[] args) {
        //首先创造一个数组，用来存放Person类型的对象
        Person[] array = new Person[4];
        Person one = new Person("汤唯",20);
        Person two = new Person("汤唯1",21);
        Person three = new Person("汤唯2",22);

        //将one当中的地址值赋值到数组的0号元素位置
        array[1] = one;
        array[2] = two;
        array[3] = three;
        System.out.println(array[1]);//cn.itcast.day04.demo04.Person@4554617c
        System.out.println(array[2]);//cn.itcast.day04.demo04.Person@74a14482
        System.out.println(array[3]);//cn.itcast.day04.demo04.Person@1540e19d

        Person person = array[1];
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(array[1].getName());
        System.out.println(array[1].getAge());

   }
}
