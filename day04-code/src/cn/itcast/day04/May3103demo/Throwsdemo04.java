package cn.itcast.day04.May3103demo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * throws关键字：异常处理的第一种方式，交给别人处理
 * 作用：
 * 当方法内部抛出（new）异常对象的时候，会把异常对象声明抛出给方法的调用者处理（比如main方法，zi'ji）
 */
public class Throwsdemo04 {
    public static void readFile(String filename) throws IOException {
        /**
         * 其实FileNotFoundException是IOException的子类，保留父类异常就行了
         */
        if (!filename.equals("c:\\a.txt")){
            throw new FileNotFoundException("文件没找到，路径不对");
        }
        if (!filename.endsWith(".txt")){
            throw new IOException("文件后缀名不对");
        }
        System.out.println("文件读取成功！");
    }

    public static void main(String[] args) throws IOException {
        readFile("c:\\A.txt");
//        readFile("c:\\a.txt");
    }

}
