package cn.itcast.day04.May3103demo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 自己处理异常
 * 格式：
 *      try{
 *          可能产生异常的代码
 *      }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
 *          异常的处理逻辑，产生异常对象之后，怎么处理异常对象
 *          一般在工作中，会把异常的信息记录到一个日志中
 *      }
 *      ...
 *      catch(异常类名 变量名){
 *
 *      }
 *      注意：
 *      1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
 *      2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，
 *      执行完毕catch中的处理逻辑，继续try...catch之后的代码
        如果try中没有产生异常，那么就不会执行catch中的异常处理逻辑，
 所以执行完try中的代码，继续执行try...catch之后的代码
 */
public class TryCatchdemo05 {
    public static void main(String[] args) {

        try {//try这儿把这个对象抛出给catch处理
            //可能产生异常的代码
            readFile("c:\\abb.txxt");
            System.out.println("这行代码是不会被执行到的");
        } catch (IOException e) {//try中抛出的什么异常，catch就定义什么异常变量，用来接收这个异常对象
            //异常的处理逻辑：产生异常对象之后，怎么处理异常对象
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("文件的后缀名不对");
            System.out.println(e.toString());
            System.out.println(e);

        }
        System.out.println("执行try...catch之后的代码");
    }
    public static void readFile(String filename) throws IOException {
        /**
         * 其实FileNotFoundException是IOException的子类，保留父类异常就行了
         */
//        if (!filename.equals("c:\\a.txt")){
//            throw new FileNotFoundException("文件没找到，路径不对");
//        }
        if (!filename.endsWith(".txt")){
            throw new IOException("文件后缀名不对");
        }
        System.out.println("文件读取成功！");
    }

}
