package cn.itcast.day04.May1802demo;

import cn.itcast.day04.demo04.Student;

/**
 * 每个对象对每一个属性都要有属于自己的独立的数据，
 * 假如：现在有一个属性，大家都是一个数据，全一样========一下全改===========
 * =======所以只在类中保存唯一一份，那所有本类对象共享同一份
 * ========一旦用了static关键字，那么这样的内容不再属于对象自己，而是属于类的，所以凡是本类的对象，都共享同一份
 */
public class Staticdemo {
    public static void main(String[] args) {
        Student two = new Student("puma",80);
        Student one = new Student("nike",110);


        one.address="USA";

        System.out.println(one.getName()+" "+one.getAge()+one.address+one.getId());
        System.out.println(two.getName()+" "+two.getAge()+two.address+two.getId());
    }
}
