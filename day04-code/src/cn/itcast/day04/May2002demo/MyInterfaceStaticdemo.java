package cn.itcast.day04.May2002demo;

/**
 * java 8 开始，允许定义静态方法，static
 *
 * public static 返回值类型 方法名称（参数列表）{
 *     方法体
 * }
 *
 * 接口直接用接口名称来调用其中的静态方法
 */
public interface MyInterfaceStaticdemo {
    public static void methodStatic(){
        System.out.println("这是接口的静态方法！");
    }
}
