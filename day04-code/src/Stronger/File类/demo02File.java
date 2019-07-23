package Stronger.File类;

import java.io.File;

public class demo02File {
    public static void main(String[] args) {
/*File类的构造方法
* File(String pathname) 相对路径 绝对路径都行  路径可以是存在，也可以是不存在
* 创建Flie对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
* */
        show01();
        show02();
        show03();
                
    }

    private static void show03() {
        File f3 = new File(new File("c:\\"), "a.txt");
        //这里父路径是File类型的对象，可以对一些方法进行操作
    }

    private static void show02() {
        File f2 = new File("父路径", "子路径");//使用起来较灵活
    }

    private static void show01() {
        File f1 = new File("D:\\basic-code\\day04-code\\src\\Stronger");
        System.out.println(f1);//重写了object的toString方法
    }
}
