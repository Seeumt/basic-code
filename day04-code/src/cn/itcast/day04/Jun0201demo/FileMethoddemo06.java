package cn.itcast.day04.Jun0201demo;

import java.io.File;

/**
 * File类遍历 目录/文件夹
 * 给出的目录的路径不存在 会抛出空指针异常
 * 给出的路径不是一个目录 也会抛出空指针异常
 *
 * list() 返回一个String数组，表示File目录中的所有子文件或目录
 * 遍历构造方法中给出的目录，会获取目录中的所有文件、文件夹的名称，把获取到的多个名称存储到一个String类型的数组中
 * *listFiles() 返回一个File数组，表示File目录中的所有子文件或目录
 * 遍历构造方法中给出的目录，会获取目录中的所有文件、文件夹*****，
 * 把获取到的文件夹/或文件封装成File对象，多个File对象储存到File数组里
 */
public class FileMethoddemo06 {
    public static void main(String[] args) {

        show01();

    }

    private static void show01() {
        File f1 = new File("D:\\basic-code\\day04-code\\src\\cn\\itcast\\day04\\May2203demo");
        System.out.println(f1.list());//[Ljava.lang.String;@4554617c  返回的是数组
        String[] arr1 = f1.list();
        for (String filename : arr1) {
            System.out.println(filename);
        }

        File f2= new File("D:\\basic-code\\day04-code\\src\\cn\\itcast\\day04\\May2202demo");
        System.out.println(f2.listFiles());//[Ljava.lang.String;@4554617c  返回的是数组
        File[] arr2 = f2.listFiles();
        for (File filename1 : arr2) {
            System.out.println(filename1);
        }
    }
}
