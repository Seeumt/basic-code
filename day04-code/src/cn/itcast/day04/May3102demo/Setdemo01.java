package cn.itcast.day04.May3102demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet():
 * 不允许储存相同的元素
 * 没有索引
 * 没有带索引的方法，也不能使用普通的for循环，可以使用for-each
 * 是一个无序的集合，存储元素和取出元素的顺序有可能不一致
 * 底层是一个哈希表结构（查询的速度非常快）
 */
public class Setdemo01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(2);
        set.add(6);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n);//123456
        }

    }
}
