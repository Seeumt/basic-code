package cn.itcast.day04.May2203demo;
/**
 * 如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类
 * 身体和心脏的关系 汽车和发动机
 *
 * 分类
 * 成员内部类
 * 局部内部类（包含匿名内部类）
 *
 * 成员内部类的定义格式：
 * 修饰符 class 外部类名称{
 *     //。。。
 *   修饰符 class 内部类名称{
 *     //。。。
 *  }
 * }
 * 内用外，随便访问
 * 外用内，一定要有内部类的对象
 * ======================================
 * * 如何使用成员内部类呢？ 有两种方式
 *          * 1.间接 ：在外部类的方法中，使用内部类，然后main只是调用外部类的方法
 *          * 2.外部类名称.内部类名称 对象名称 = new 外部类对象().new 内部类名称();
 *
 *
 * 权限修饰符：
 * 外部类：public/default
 * 成员内部类：全行
 * 局部内部类：什么都不能写
 */
public class Main {
    public static void main(String[] args) {
        Bodydemo01 body = new Bodydemo01();
        body.methodBody();
        Outerdemo02.Inner obj = new Outerdemo02().new Inner();
        obj.InnerMethod();
    }
}
