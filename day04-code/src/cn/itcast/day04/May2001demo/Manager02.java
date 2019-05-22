package cn.itcast.day04.May2001demo;

import java.util.ArrayList;

public class Manager02 extends User01{

    public Manager02(){
        //super() 默认赠送
    }

    public Manager02(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney ,int count){
        //用集合来存储若干个红包的金额
        ArrayList<Integer> redlist = new ArrayList<>();

        //首先判断一下自己的余额
        int leftMoney = super.getMoney();//被继承者赋予你的方法，继承者们都可以使用
        return redlist;
    }
//    public void send(int money, int count){
//
//    }
}
