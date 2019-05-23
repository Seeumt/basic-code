package cn.itcast.day04.May2201demo;

/**
 * 对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样是不可变
 *
 * 1.由于成员变量有默认值null，所以用了final之后必须手动赋值，不能给默认值了
 * 2.对于final的成员变量，要么直接赋值。要么通过构造方法直接赋值，二选一
 * 3.必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值
 *
 *
 */
public class Persondemo07 {
    private final String name;

    public Persondemo07() {
        name="嘀嘀";
    }


    public Persondemo07(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
