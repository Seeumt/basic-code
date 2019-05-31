package cn.itcast.day04.May3102demo;

import static cn.itcast.day04.demo02.Demo02MethodDefine.add;

/**
 * 一个方法的参数列表，只能有一个可变参数
 * 如果方法的参数有多个，那么可变传参数必须写在参数列表的末尾
 */
public class VarArgsdemo05 {
    public static void main(String[] args) {
       // System.out.println(plus(2,3));
        plus(1,2,3,4,5,6);
        omethod(6.66,"dsafhak",5.2,666);

    }

//    private static int plus(int a ,int b) {
//        return a+b;
//    }
    private static int plus(int...arr) {//arr是一个数组
        System.out.println(arr);
        return 0;
    }

    private static void $plus(String a,double x ,int...arr) {//arr是一个数组
        System.out.println(arr);
    }
    /**
     * 特殊写法
     *
     */
    private static void omethod(Object...obj){

    }
}
