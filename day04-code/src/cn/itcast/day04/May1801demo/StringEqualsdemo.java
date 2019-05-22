package cn.itcast.day04.May1801demo;
/*
对于引用数据来讲，==是进行对象的地址值的比较，如果确实需要字符串的内容比较，可以用
**/
public class StringEqualsdemo {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};//自己new的不在池子里
        String str3 = new String(charArray);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals("abc"));
        System.out.println(str3.equals("abc"));
        System.out.println("abc".equals(str3));//=========== 推荐！把常量写在前边==============
        System.out.println("======================");

        String str4 = null;
        System.out.println("abc".equals(str4));//推荐！ false
        //System.out.println(str4.equals("abc"));//空指针异常NullPointerException
        System.out.println("=======================");




    }
}
