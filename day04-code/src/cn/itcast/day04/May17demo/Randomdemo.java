package cn.itcast.day04.May17demo;
import java.util.*;
public class Randomdemo {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        int num1 = r.nextInt(10);
        int num2 = r.nextInt(10)+1;
        System.out.println("随机数是"+ num);
        System.out.println("随机数是"+ num1);
    }

}
