package cn.itcast.day04.May2402demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Datedemo04 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您的出生日期,格式为:yyyy-MM-dd");
        System.out.println("========================================================");
        String birthday=in.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdateX= sdf.parse(birthday);
        long birthdateXX =birthdateX.getTime();
        long todayTime= new Date().getTime();
        long birthdayXXX =todayTime-birthdateXX;
        System.out.println(birthdayXXX/86400000);

    }
}
