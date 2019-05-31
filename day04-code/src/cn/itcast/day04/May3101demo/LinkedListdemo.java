package cn.itcast.day04.May3101demo;

import java.util.LinkedList;

/**
 * linkedList集合的特点：
 * 1.底层是一个链表结构，查询慢，增删快
 * 2.包含了大量操作首尾元素的方法
 * 要使用它特有的方法，不能使用多态
 */
public class LinkedListdemo {

    public static void main(String[] args) {
        show01();
    }

    //public boolean isEmpty():如果列表不包含元素，则返回True；
    private static void show01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.addFirst("www");
        linked.push("First");
        linked.addLast(".com");
        System.out.println(linked);
        linked.pop();//removeFirst();
        System.out.println(linked);
        linked.removeFirst();
        System.out.println(linked);
    }
}
