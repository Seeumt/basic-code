package cn.itcast.day04.May220301demo;

import java.sql.SQLOutput;

public class Gamedemo14 {
    public static void main(String[] args) {
        Herodemo12 hero = new Herodemo12();
        hero.setName("Harden");

        //设置英雄技能
//        hero.setSkilldemo13(new SkillImpldemo15());
//        hero.attack();

        //改用使用匿名内部类
//        Skilldemo13 skilldemo13 = new Skilldemo13() {
//            @Override
//            public void use() {
//                System.out.println("Pia`Pia`Pia");
//            }
//        };
//        hero.setSkilldemo13(skilldemo13);
//        hero.attack();

        //同时使用匿名内部类和匿名对象
        hero.setSkilldemo13(new Skilldemo13() {
            @Override
            public void use() {
                System.out.println("造犯规！！！！！");
            }
        });
        hero.attack();
    }
}
