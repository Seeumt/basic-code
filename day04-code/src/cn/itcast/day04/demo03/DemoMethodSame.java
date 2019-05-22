package cn.itcast.day04.demo03;
/*

 */
public class DemoMethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,10));
        System.out.println(isSame(10,80));
    }
    public static boolean isSame(int a,int b){
       /* boolean same;//布尔值叫same？？
        if(a==b){
            same=true;
        }else {
            same=false;
        }
        return same;*/
       return a==b;
    }
}

