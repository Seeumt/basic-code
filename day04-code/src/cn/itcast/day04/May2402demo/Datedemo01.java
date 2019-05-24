package cn.itcast.day04.May2402demo;

/**
 * 毫秒可以对时间和日期进行计算
 * 算2099-01-03与2088-01-01之间有多少天
 */
public class Datedemo01 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/86400000/365);
    }
}
