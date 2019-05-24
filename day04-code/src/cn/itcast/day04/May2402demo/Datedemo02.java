package cn.itcast.day04.May2402demo;

import java.util.Date;

/**
 * 毫秒可以对时间和日期进行计算
 * 算2099-01-03与2088-01-01之间有多少天
 */
public class Datedemo02 {
    public static void main(String[] args) {
        demo1();
        demo02();
        demo03();
    }

    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    private static void demo02() {
        Date date = new Date(0l);
        System.out.println(date);

    }

    /**
     * date类的空参数构造方法
     */
    private static void demo1() {
        Date date = new Date();
        //date类覆盖重写了toString方法
        System.out.println(date);
    }
}
