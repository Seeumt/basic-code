package cn.itcast.day04.May2002demo;

/**
 * 在任何版本的Java 中，接口都可以定义抽象方法
 * 接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract(可以选择性地不写)
 *
 *
 */
public interface MyInterfaceAbstractdemo02 {

    public abstract void methodAbs();

}

/**
 * 接口不可以直接使用，必须有一个"实现类"来实现接口
 * public class 实现类名称 implements 接口名称{
 *     //
 * }
 */

/*
接口的实现类必须覆盖重写（实现）接口中的所有抽象方法，去掉abstract关键字，加上{}
 */