package cn.itcast.day04.May2001demo;

public class Maindemo {
    public static void main(String[] args) {
        //AbstractAnimaldemo animal = new AbstractAnimaldemo();//不可以直接new抽象类的对象
        Dog2ha dog2ha = new Dog2ha();
        dog2ha.eat();
        dog2ha.sleep();
        DogGoldendemo g = new DogGoldendemo();
        g.eat();
        g.sleep();

    }
}
