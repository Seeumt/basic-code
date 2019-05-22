package cn.itcast.day04.May2002demo;

/**
 * JAVA9开始，接口当中允许定义私有方法
 * private的方法只能被接口自己调用，不能被实现类或别人使用
 * 1.普通私有方法，解决多个默认方法之间重复代码的问题、
 * private 返回值类型 方法名称（参数列表）{
 *     方法体
 *  }
 * 2.静态私有方法，解决多个静态方法之间重复代码的问题
 *  private static 返回值类型 方法名称（参数列表）{
 *      方法体
 *  }
 */
public interface MyInterfacePrivateAdemo {
    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommomn();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");

    }

    public default void methodCommomn(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");

    }
}
