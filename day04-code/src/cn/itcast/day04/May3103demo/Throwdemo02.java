package cn.itcast.day04.May3103demo;

/**
 * throw关键字
 * 作用；
 *          在指定方法中抛出指定的异常
 * 使用格式；
 *          throw new xxxException("异常产生的原因）
 * 注意：
 *          1.throw关键字必须写在方法的内部
 *          2.throw关键字后面new出来的对象必须是Exception或Exception的子类对象
 *          3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
 *          throw关键字后面创建的是RunTimeException(运行期异常)或者是RuntimeException的子类对象，我们可以不处理，
 *          默认交给JVM处理（打印异常对象，中断程序）
 *          throw关键字后面创建的是编译异常（写代码的时候报错），我们就必须处理这个异常，要么throws,要么try...catch

 */
public class Throwdemo02 {

    public static void main(String[] args) {
        int[] arr1 = null;
        int e = getElement(arr1,0);
    }
    public static int getElement(int[] arr,int index){
        if (arr==null){
            throw new NullPointerException("传递的数组的值是null");
        }
        int ele = arr[index];
        return ele;
    }
}
