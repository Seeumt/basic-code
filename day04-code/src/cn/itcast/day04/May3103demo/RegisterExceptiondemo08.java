package cn.itcast.day04.May3103demo;

/**
 * 自定义异常类：
 *          java提供的异常类不够我们使用，需要我们定义一些异常类
 * 格式：
 *         public class xxxException extends Exception（编译异常）/RuntimeException{
 *         添加一个空参数的构造方法
 *         添加一个带异常信息的构造方法
 *
 *         }
 */
public class RegisterExceptiondemo08 extends /*Exception*/RuntimeException{
    public RegisterExceptiondemo08(){
        //super();
    }
    /**
     * 添加一个带异常信息的构造方法
     * 查看源码发现，所有的异常类都会有一个带异常信息的构造方法，
     * 方法内部会调用父类带异常信息的构造方法，
     * 让父类来处理这个异常信息
     */
    public RegisterExceptiondemo08(String message) {
        super(message);
    }
}
