package cn.itcast.day04.May3102demo;

import cn.itcast.day04.demo04.Person;

import java.util.HashSet;

public class HashSetSavePersondemo03 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("汤唯",20);
        Person p2 = new Person("姚晨",30);
        Person p3 = new Person("姚晨",25);
        Person p4 = new Person("姚晨",25);//必须重写hashCode和equals方法 alt+insert generate
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);
    }
}
