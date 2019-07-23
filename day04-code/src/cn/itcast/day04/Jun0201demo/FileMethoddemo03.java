package cn.itcast.day04.Jun0201demo;

import java.io.File;

/**
 * getAbsolutePath() 不管创建路径传入的是什么路径，使用该方法后都是绝对路径
 * getPath()   例化的时候传入的是什么路径，使用该方法后就是什么路径 绝对--> 绝对  相对-->相对
 *
 * getName():返回由此File表示的文件或目录的名称
 * 获取的就是构造方法传递进来的路径的结尾部分（文件/文件夹）
 *
 * length() : 返回由此File表示的文件的长度，构造方法指定的文件的大小，以字节为单位
 *  文件夹没有大小概念，假路径返回的就是0
 */
//例化的时候传入的是什么路径，使用该方法后都是绝对路径
public class FileMethoddemo03 {
    public static void main(String[] args) {
      show01();
      show02();
      show03();
      show04();
    }

    private static void show04() {
        File f6 = new File("C:\\Users\\Admin\\Desktop\\2309.txt");
        System.out.println(f6.length());//2793

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
