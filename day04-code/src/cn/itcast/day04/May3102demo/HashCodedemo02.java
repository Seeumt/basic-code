package cn.itcast.day04.May3102demo;

import cn.itcast.day04.demo04.Person;

public class HashCodedemo02 {
    public static void main(String[] args) {
        Person p1 =new Person("Durant",30);
        Person p2 =new Person("Curry",30);
        int n1 =p1.hashCode();
        int n2 =p2.hashCode();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(p1);//改写了获取地址值的那个方法
        System.out.println(p2);
/**
 * 1163157884  @4554617c 一样
 * 1956725890  @74a14482
 * cn.itcast.day04.demo04.Person@4554617c
 * cn.itcast.day04.demo04.Person@74a14482
 */

/**
 * String类的哈希值
 * String类重写Object类的hashcCode方法
 */
        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("sdasd".hashCode());
        System.out.println("sdasdsadd".hashCode());
    }
}
