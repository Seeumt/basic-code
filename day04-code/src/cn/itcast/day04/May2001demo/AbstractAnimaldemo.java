package cn.itcast.day04.May2001demo;

/**
 * 抽象方法：加上abstract关键字，然后去掉大括号，分号结束
 * 抽象方法所在的类，必须是抽象类才行，在class之前写上abstract
 *
 * 不可以直接创建new抽象类的对象
 * 必须用一个子类来继承抽象对象
 * 子类必须覆盖重写抽象父类当中的所有的抽象方法（取掉abstract关键字，加上大括号{}）,除非该子类也是抽象类
 * 创建子类对象进行使用
 */
public abstract class AbstractAnimaldemo {

    public abstract void eat();
    public abstract void sleep();

}
