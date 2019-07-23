package cn.itcast.day04.Jun0201demo;

import java.io.File;
import java.io.IOException;

public class FileMethoddemo05 {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    private static void show03() {
        //删除文件或文件夹

        File f6= new File("D:\\basic-code\\day04-code\\aaa\\aaaa");

        boolean b6 = f6.delete();

        System.out.println(b6);

    }

//    private static void show02() {
//        File f3= new File("day04-code\\aaa");
//        boolean b3 = f3.mkdir();
//        System.out.println(b3);
//        File f4= new File("day04-code\\aaa\\aaaa\\aaaaa");
//        boolean b4 = f4.mkdirs();
//        System.out.println(b4);
//
//    }
//
//    private static void show01() throws IOException {
//        File f1 = new File("D:\\basic-code\\day04-code\\src\\cn\\itcast\\day04\\Jun0201demo\\1.txt");
//        boolean b1 = f1.createNewFile();//！！！文件！！！
//        System.out.println(b1);
//        File f2 = new File("day04-code\\2.txt");
//        boolean b2 = f2.createNewFile();
//        System.out.println(b2);
//    }
}
