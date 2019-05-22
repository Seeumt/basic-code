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
public interface MyInterfaceDefaultdemo {
    public abstract void method1();
    //当A B 首次完全实现了接口当中的所有抽象方法后
    // ，但是当接口中又添加了新的抽象方法时，AB就出错了，默认方法就是解决这种矛盾
    //public abstract void method2();

    /**
     * 接口当中的默认方法，可以解决接口升级的问题
     */
    //将新添加的方法写成默认方法就可以解决
    public default void method2(){
        System.out.println("默认方法会被你的实现类继承下去的");
    }
    public default void methodConflict(){
        System.out.println("接口中默认方法冲突了");
    }

    //默认方法会被你的实现类继承下去的

}
