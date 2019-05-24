package cn.itcast.day04.May2401demo;

public class Persondemo02 {
    private String name;
    private int age;

    public Persondemo02() {
    }

    public Persondemo02(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    @Override
//    public String toString(){
//        return "姓名是"+name+"年龄是"+age;
//    }
    @Override
    public boolean equals(Object obj){
        //如果是Persondemo02类的，才可以强转？？？
        //Object里是没有目标属性的，需要向下/强制转型成为目标对象
        Persondemo02 p = (Persondemo02) obj;
//        return (this.name.equals(p.name)&&this.age.equals(p.age));
        return this.name.equals(p.name)&&this.age==p.age;
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
}
