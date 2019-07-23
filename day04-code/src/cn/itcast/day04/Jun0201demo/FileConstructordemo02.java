package cn.itcast.day04.Jun0201demo;

import java.io.File;
/*
先看是否有静态成员，就可以通过类名进行访问
再看是否有构造方法，然后创建对象，在通过对象名访问成员方法
 */
public class FileConstructordemo02 {
    /**
     * File的构造方法01
     * ====================
     * 路径可以是以文件结尾，也可以是以文件夹结尾
     * 路径可以是相对路径，也可以是绝对路径
     * 路径可以存在，也可以是不存在
     *================创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况====================
     *
     * File的构造方法02
     * //父路径和子路径，可以分别书写。使用起来非常灵活，父路径和子路径都可以变化
     *
     *
     * File的构造方法03
     * //父路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径创建对象
     */
    public static void main(String[] args) {
        show01();
        show02("C:\\","a.txt");

       show03();
        File f1 = new File("a.txt");
        System.out.println(f1);
    }



    private static void show03() {
        File parent = new File("c:\\");
//        File file = new File(parent,"hello.java");//创建出来的parent对象作为
        File file = new File((new File("c:\\")),"hjhkshjf.exe");
        System.out.println(file);

    }

    private static void show02(String parent,String child) {
        File file = new File(parent,child);
        System.out.println(file);
    }

    private static void show01() {
        File f = new File("C://asdsd.exe");
        System.out.println(f);
    }

}
