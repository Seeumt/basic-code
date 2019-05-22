package cn.itcast.day04.May1801demo;

public class Stringgetdemo {
    public static void main(String[] args) {
        String str="dasdas";
        System.out.println(str.length());
        //拼接字符串
        String str1 = "hello";
        String str2 = ",bye";
        System.out.println(str1.concat(str2));

        //获取指定索引位置的单个字符
        System.out.println("123456".charAt(0));


        //查找参数字符串在本来字符串当中出现的第一次索引位置，根本没有返回-1
        System.out.println("Java".indexOf("Python"));
    }
}
