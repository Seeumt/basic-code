package cn.itcast.day04.May2002demo;

/**
 * java8开始，接口可以定义默认方法
 * 格式：
 * public defaulr 返回值类型 方法名称（参数列表）{
 *     方法体
 * }
 *
 * 接口当中的默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault_Plusdemo {

    public default void methodConflict(){
        System.out.println("与接口中默认方法冲突了");
    }

    //默认方法会被你的实现类继承下去的

}
