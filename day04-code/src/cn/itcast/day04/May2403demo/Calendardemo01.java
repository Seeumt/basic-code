package cn.itcast.day04.May2403demo;

import java.util.Calendar;

/**
 * calendar 抽象类
 * 其无法直接创建对象使用，里面有一个静态方法叫getInstance(),该方法返回了calendar类子类对象
 * static Calendar getInstance() 使用默认时区和语言获得一个日历
 */
public class Calendardemo01 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();//多态
        System.out.println(c);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
    }
}
