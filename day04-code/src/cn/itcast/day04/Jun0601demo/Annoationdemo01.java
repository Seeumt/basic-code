package cn.itcast.day04.Jun0601demo;

//@SuppressWarnings("all")
public class Annoationdemo01 {
    /**
     * @Deprecated 这个是说某方法过时，那个方法前面有这注解，调用它的时候就会有删除线
     * @SuppressWarning("all") 压制警告 不显示删除线、方法没有被使用等
     */

    @Deprecated
    public void m1() {

    }

    public void m2() {

    }


    public void m3() {
        m1();
    }
}





