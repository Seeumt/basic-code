package Stronger.File类;

import org.junit.jupiter.api.Test;

import java.io.File;

public class demo03File {
    public static void main(String[] args) {

        show04();
        show03();
        show02();
        show01();
    }

    private static void show04() {
        File f7 = new File("D:\\basic-code\\day04-code\\src\\Stronger");
        long length = f7.length();
        System.out.println(length);//字节单位的大小，如果文件不存在 返回0 文件夹也是0
    }

    private static void show03() {
        File f5 = new File("D:\\basic-code\\day04-code\\src\\Stronger\\demo01File.java");
        String f5Name = f5.getName();
        System.out.println(f5Name);
        File f6 = new File("D:\\basic-code\\day04-code\\src\\Stronger");
        String f6Name = f6.getName();
        System.out.println(f6Name);
    }

    private static void show02() {
        File f3 = new File("D:\\basic-code\\day04-code\\src\\Stronger\\demo01File.java");
        String Path1 = f3.getPath();
        System.out.println(Path1);
        File f4 = new File("demo01File");
        String Path2 = f4.getPath();
        System.out.println(Path2);
        System.out.println(Path1.toString());
        System.out.println(Path2.toString());//其实就是getPath()方法
    }

    private static void show01() {
        File f1 = new File("D:\\basic-code\\day04-code\\src\\Stronger\\demo01File.java");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);//D:\basic-code\day04-code\src\Stronger\demo01File.java
        File f2 = new File("demo01File");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);//D:\basic-code\demo01File

    }
}
