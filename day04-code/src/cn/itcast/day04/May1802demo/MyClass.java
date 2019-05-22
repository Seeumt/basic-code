package cn.itcast.day04.May1802demo;

/**
 * 静态方法中 ，不能直接访问非静态
 * ====因为在内存中【先】有的静态内容，【后】有的非静态内容
 * 先人不知道后人
 * 静态方法中不能用this，通过谁调用的
 * ====因为this代表当前对象，通过谁调用的方法，谁就是当前对象
 */
public class MyClass {
    int num;//成员变量
    static int numStatic;//静态变量
    static {
        System.out.println("哈哈，我这边是静态代码块哦，我比别的先执行！");
    }
    public MyClass(){
        System.out.println("我是构造方法");
    }
    public void method(){
        System.out.println("这是一个成员方法");
    }

    public static void methodStatic(){
        System.out.println("这是一个静态方法");
    }
}
