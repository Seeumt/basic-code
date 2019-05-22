package cn.itcast.day04.May17demo;

import java.util.ArrayList;

//ArrayList集合的长度是可以变化的
/*对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型，也就是装在集合当中的所有元素，全都是统一的类型
泛型，只能是引用类型，不能是基本类型
*/
public class ArrayListdemo {
    public static void main(String[] args) {
        //创建了一个Arraylist集合，集合的名称是list,里面装的全都是String字符串类型的数据

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]
        //向集合当中添加一些数据，需要用到add方法
        list.add("赵丽颖");
        System.out.println(list);//[赵丽颖]
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
    }
}
