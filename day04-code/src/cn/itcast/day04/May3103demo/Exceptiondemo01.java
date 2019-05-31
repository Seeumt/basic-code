package cn.itcast.day04.May3103demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常本身市一个类，产生异常就是创建异常对象并抛出了一个异常对象
 */
public class Exceptiondemo01  {

    public static void main(String[]args) /*throws ParseException*/ {
        /**
         * 编译异常
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1998-10-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally语句里面的代码是一定会被执行的！！");
        }
        System.out.println(date);
        System.out.println("后续代码");

        /**
         * 运行异常
         * 格式：
         *  *      try{
         *  *          可能产生异常的代码
         *  *      }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
         *  *          异常的处理逻辑，产生异常对象之后，怎么处理异常对象
         *  *          一般在工作中，会把异常的信息记录到一个日志中
         *  *      }
         *  *      ...
         *  *      catch(异常类名 变量名){
         *  *
         *  *      }finally{
         *   ==============无论是否出现异常都会执行=============
         *  }
         *  注意：1.finally不能单独使用，必须和catch一起使用
         *        2.finally一般用于资源释放(资源回收），无论程序是否出现异常，最后都要资源释放，IO流*/
    }}
