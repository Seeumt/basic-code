package cn.itcast.day04.May220301demo;

import cn.itcast.day04.May220301demo.Herodemo09;
import cn.itcast.day04.May220301demo.Weapondemo10;

public class Maindemo11 {

    public static void main(String[] args) {
        //创建一个英雄角色
        Herodemo09 hero = new Herodemo09();
        hero.setName("LEBRON");
        hero.setAge(30);

        //创建一个武器对象
        Weapondemo10 weapon = new Weapondemo10("AK47");
        hero.setWeapondemo10(weapon);

        hero.attack();

        Weapondemo10 AWM = new Weapondemo10("AWM");

        Herodemo09 hero1 = new Herodemo09("dd",20,AWM);
        hero1.attack();
    }
}
//其实任何一种数据类型都可以作为成员变量的类型