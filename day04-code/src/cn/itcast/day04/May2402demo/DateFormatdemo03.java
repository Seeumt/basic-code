package cn.itcast.day04.May2402demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatdemo03 {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }


    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String day = sdf.format(date);
        System.out.println(day);
    }

    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = sdf.parse("2019年05月24日 18时16分35秒");
        System.out.println(date);
    }


}
