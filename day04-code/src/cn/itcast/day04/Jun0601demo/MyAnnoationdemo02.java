package cn.itcast.day04.Jun0601demo;

/**
 * C:\Users\Admin>javap MyAnnoationdemo02.class
 * Compiled from "MyAnnoationdemo02.java"
 * public interface MyAnnoationdemo02 extends java.lang.annotation.Annotation {
 * }
 * 注解本质上就是一个接口，该接口默认继承Annotation接口
 * 那接口里面能定义什么，注解里就能定义什么

 * 元注解
 * public @interface MyAnnoationdemo02 {

 * }
 * 属性：接口中可以定义的常量、方法
 * 属性的返回值类型，
 * 基本数据类型
 * String      defalut 可以默认赋值 不用写等号， default后面就是值
 * 枚举
 * 注解
 * 以上类型的数组
 *
 *
 * 定义了数组，在使用时需要给属性赋值，
 * @注解名(方法名（属性）=符合返回值类型的值)
 *
 * 如果当只有一个属性的时候，且这个属性叫value 则可以再复制的的时候不写value=
 *
 * 数组赋值时要用{}包裹，要是只有一个值，可以不写大括号
 */

public @interface MyAnnoationdemo02 {
    String show();

}
