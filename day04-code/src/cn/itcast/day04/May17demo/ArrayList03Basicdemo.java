package cn.itcast.day04.May17demo;

import java.util.ArrayList;

/*
如果希望向集合ArrayList当中储存基本类型数据，必须使用基本类型对应的“包装类”
基本类型               包装类
byte                    Byte
short                   Short
int                     Integar
long
float
double
char                    Character
boolean
* */
public class ArrayList03Basicdemo {
    public static void main(String[] args) {
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(888);
        list3.add(666);
        int number = list3.get(0);
        System.out.println(list3);
        System.out.println(number);

    }
}
