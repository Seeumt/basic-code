package cn.itcast.day04.May2202demo;

/**
 * Java权限修饰符    public      protected       default         private
 * 同一个类            yes          yes             yes             yes
 * 同一个包             yes         yes             yes             no
 * 不同包子类            yes        yes              no             no
 * 不同包非子类           yes
 */


import cn.itcast.day04.May2203demo.Bodydemo01;

/**
 * * 如何使用成员内部类呢？ 有两种方式
 *          * 1.间接 ：在外部类的方法中，使用内部类，然后main只是调用外部类的方法
 *          * 2.外部类名称.内部类名称 对象名称 = new 外部类对象().new 内部类名称();
  */

public class Main01 {

}
