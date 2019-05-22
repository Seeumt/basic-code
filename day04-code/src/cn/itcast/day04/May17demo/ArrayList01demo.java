package cn.itcast.day04.May17demo;

import java.util.ArrayList;

/*public boolean add(E e); 向集合当中添加元素，参数的类型和泛型一致.返回值代表添加是否成功
备注：对于Arraylist来说，add添加动作一定是成功的，所以返回值可用可不用
别的集合就不一定能添加成功了
   public E(类型名称) get(int index); 从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
   public E remove(int index); 从集合当中删除元素，参数是索引编号，返回值就是对应位置的元素
   public int size();获取集合的尺寸长度，返回值就是集合中包含的元素个数。
    */
public class ArrayList01demo {
    public static void main(String[] args) {
        ArrayList<String>  list1 = new ArrayList<>();
        //向集合中添加元素
        boolean success = list1.add("梁静茹");
        System.out.println("添加动作是否成功："+ success);
        list1.add("孙燕姿");
        //从集合中获取元素，get.索引值从0开始
        String name = list1.get(1);
        System.out.println("第2号索引位置："+ name);
    }

}
