package cn.itcast.day04.May3001demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 斗地主：
 * 准备牌
 * 洗牌
 * 发牌
 * 看牌
 *
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //定义一个储存54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个数组储存牌的花色，一个储存牌的序号
        String[] colors={"♠","💗","♣","♦"};
        String[] numbers ={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //把大王小王添加到poker集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组，随机组合52张牌
        for(String number:numbers){
            for (String color : colors) {
                poker.add(color+number);
            }
        }
        System.out.println(poker);

        //洗牌
        Collections.shuffle(poker);
        System.out.println(poker);


        //发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            //轮流发牌
            if (i>=51){
                //给底牌发牌
                diPai.add(p);
            }else if (i%3==0){
                player01.add(p);
            }else if (i%3==1){
                player02.add(p);
            }else if (i%3==2){
                player03.add(p);
            }
        }

        //看牌
        System.out.println("刘德华："+player01);
        System.out.println("周润发："+player02);
        System.out.println("周星驰："+player03);
        System.out.println("底牌"+diPai);

   }
}
