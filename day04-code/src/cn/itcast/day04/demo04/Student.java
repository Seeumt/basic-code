package cn.itcast.day04.demo04;

/**
 * 无参构造方法 以后用创建下的对象进行赋值
 */
public class Student {
    private int id;
    private String name;
    private int age;
    public static int idCounter=0;//学号计数器，每当new了一个新的对象的时候，计数器++
    public static String address;


    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Student.address = address;
    }

    public Student() {
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;              //?????????????????????    id不是共享的，idCounter0
    }

}
