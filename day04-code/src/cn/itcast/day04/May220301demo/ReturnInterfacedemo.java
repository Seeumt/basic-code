package cn.itcast.day04.May220301demo;

import java.util.ArrayList;
import java.util.List;

public class ReturnInterfacedemo {
    public static List<String> addName(List<String> list){
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    return list;


    }

    public static void main(String[] args) {

        //左边接口名称，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();

        List<String> result = addName(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
