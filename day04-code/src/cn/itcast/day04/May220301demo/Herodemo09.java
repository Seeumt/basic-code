package cn.itcast.day04.May220301demo;

public class Herodemo09 {

    private String name;
    private int age;
    private Weapondemo10 weapondemo10;

    public Herodemo09() {
    }

    public Herodemo09(String name, int age, Weapondemo10 weapondemo10) {
        this.name = name;
        this.age = age;
        this.weapondemo10 = weapondemo10;
    }

    public void attack(){
        System.out.println("年龄为"+age+"的"+name+"正在用"+ weapondemo10.getCode()+"发动进攻");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapondemo10 getWeapondemo10() {
        return weapondemo10;
    }

    public void setWeapondemo10(Weapondemo10 weapondemo10) {
        this.weapondemo10 = weapondemo10;
    }

}
