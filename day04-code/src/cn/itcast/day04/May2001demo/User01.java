package cn.itcast.day04.May2001demo;

public class User01 {
    private String name;

    private int money;

    public User01(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User01() {
    }

    public  void show(){
        System.out.println("我叫"+name+"我有多少钱："+money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
