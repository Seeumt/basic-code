package Stronger.File类;

import java.io.File;
import java.io.IOException;

public class demo05File {
    public static void main(String[] args) throws IOException {
        show03();
        show02();
        show01();
    }

    private static void show03() {
        /**
         * 可以删除文件夹，也可以删除，但是文件夹里有内容就不会删除，返回false
         * 注意：delete直接在硬盘删除，不去回收站
         */
    }

    private static void show02() {
        File f4 = new File("D:\\basic-code\\day04-code\\src\\wenjianjia");
        boolean mkdir = f4.mkdir();
        System.out.println(mkdir);
        File f5 = new File("D:\\basic-code\\day04-code\\src\\wenjianjiaaaa\\aa\\bb\\c");
        boolean mkdirs = f5.mkdirs();
        System.out.println(mkdirs);
    }

    private static void show01() throws IOException {
        File f1 = new File("D:\\basic-code\\day04-code\\src\\Stronger\\1.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);

        File f2 = new File("D:\\basic-code\\day04-code\\src\\Stronger\\2.txt");
        boolean newFile2 = f2.createNewFile();
        System.out.println(newFile2);

//        File f3 = new File("D:\\basic-code\\day04-code\\src\\Strooooonger\\2.txt");
//        boolean newFile3 = f3.createNewFile();//路径不存在会抛异常
//        System.out.println(newFile3);
    }
}
