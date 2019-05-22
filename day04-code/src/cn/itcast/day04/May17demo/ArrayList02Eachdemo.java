package cn.itcast.day04.May17demo;

import java.util.ArrayList;

public class ArrayList02Eachdemo {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("s");
        list2.add("d");
        list2.add("f");
        list2.add("g");
        //遍历集合
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i)+" "); //遍历出来每一个元素
        }
        System.out.println(list2);  //打印整个集合[]
    }
}
