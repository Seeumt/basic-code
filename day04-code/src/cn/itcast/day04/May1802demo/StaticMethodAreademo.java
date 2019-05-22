package cn.itcast.day04.May1802demo;

/**
 * public class 类名称{
 *     static{
 *         //静态代码区的内容
 *     }
 * }
 * 特点：当第一次用到本类的时候，静态代码唯一执行一次
 * 静态内容总是优先于非静态，所以静态代码块比构造方法要优先
 *
 *
 * 典型用途，用来一次性地对静态成员变量进行赋值
 */
public class StaticMethodAreademo {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();

    }
}
