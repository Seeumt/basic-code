package cn.itcast.day04.Jun0201demo;

import java.io.File;

/**
 * .exist()
 * .isDirectory()
 * .isFile()
 * 上面这俩应该在满足路径存在的前提下使用，不然返回的都是false
 */
public class FileMethoddemo04 {
    public static void main(String[] args) {
    show04();
    }

    private static void show04() {
        File f6 = new File("C:\\Users\\Admin\\Desktopp\\2309.txt");
        System.out.println(f6.exists());//绝对路径、相对路径都可以判断
    //    System.out.println(f6.length());//2793

    }

    private static void show03() {
        File f4 = new File("D:\\basic-code\\Jun0201demo.java");
        System.out.println(f4.getName());
        File f5 = new File("Jun0201demo.java");
        System.out.println(f5.getName());
    }

    private static void show02() {//
        File f2 = new File("D:\\basic-code\\Jun0201demo.java");
        System.out.println(f2.getPath());
        File f3 = new File("Jun0201demo.java");
        System.out.println(f3.getPath());
    }

    private static void show01() {
        File f1 = new File("Jun0201demo.java");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);//D:\basic-code\Jun0201demo.java
    }
}
