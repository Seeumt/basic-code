package cn.itcast.day04.May3103demo;

import java.util.Objects;

public class Objectsdemo03 {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj){
        //对传递过来的参数进行合法性判断，判断是否为null
//        if (obj==null){
//            throw new NullPointerException("传递的❀对象的值是null");
//        }
        Objects.requireNonNull(obj,"传递的对象值是null");
    }
}
