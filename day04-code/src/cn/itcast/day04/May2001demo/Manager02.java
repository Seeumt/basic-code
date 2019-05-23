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
        int leftMoney = super.getMoney();//被继承者赋予你的方法，继承者们都来使用
        if (totalMoney>leftMoney){
            System.out.println("钱不够了");
            return redlist;//返回空集合 ，安全检查
        }

            //leftMoney-=totalMoney;
            //重新设置金额
            super.setMoney(leftMoney-totalMoney);

            //发红包需要平均分成count份
            int avg = totalMoney/count;
            int mod = totalMoney%count;
            for (int i = 0; i < count-1; i++) {
                redlist.add(avg);
            }

            int last = avg + mod;
            redlist.add(last);
            return redlist;


    }
//    public void send(int money, int count){
//
//    }
}
