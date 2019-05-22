package cn.itcast.day04.May2001demo;

import java.util.ArrayList;
import java.util.Random;

public class Member03 extends User01{
    public Member03(String name, int money) {
        super(name, money);
    }

    public Member03() {
    }

    public void recevie(ArrayList<Integer> list){
        //从多个红包中随机抽取一个
        //随机获取一个list中的索引编号
//        Random r = new Random();
//        int index = r.nextInt(2);  可以用匿名对象
        int index = new Random().nextInt(list.size());

        //根据索引，从集合中删除，并且得到被删除的红包，给我自己
        int delta =list.remove(index);

        int money =super.getMoney();
        super.setMoney(delta+money);
        System.out.println("我现在有"+super.getMoney()+"元");//访问父类里面的成员变量，就直接用super.getMoney()
    }
}
