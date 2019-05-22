package cn.itcast.day04.May1801demo;
/*
双引号直接弄出来的字符串，本身就是一个对象
字符常量池（在堆里），程序当中直接写上的双引号字符串，就在字符串常量池中
对于基本类型来说，==是进行数值的比较
对于引用类型来说，==是进行【地址值】的比较
* */
public class StringPooldemo {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";

        char[] charArray={'a','b','c'};//自己new的不在池子里
        String str3 = new String();
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);

    }
}
