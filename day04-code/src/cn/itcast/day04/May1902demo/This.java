package cn.itcast.day04.May1902demo;

import javax.swing.plaf.FontUIResource;

/**
 * 在本类成员方法中，访问本类的成员方法
 * 在本类的成员方法中，访问本类的另一个成员方法
 * 本类的无参构造调用有参构造
 * this()必须放在第一个 super()将不再赠送
 */
public class This extends Fu {
    int num = 20;



    public  This(){
        this(5,6);
//        this(6); this语句必须放在最前面一句
        System.out.println("*****aaa******");
    }

    public  This(int a ,int b){
        System.out.println("*****"+a+"*****"+b+"*****");
    }

    public  This(int a ){
        System.out.println("*****"+a+"******");
    }




    public static void main(String[] args) {
            This a1 = new This();
            This a2 = new This(1,2);
            This a3 = new This(3);


    }
}
