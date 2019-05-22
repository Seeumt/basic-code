package cn.itcast.day04.May1901demo;

import java.util.Arrays;

/**
 * String---->数组 toCharArray()
 * forr 倒序遍历
 *
 */
public class Arraysdemo {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);
        int[] intArray1 = {2,4,8,6,10};
        Arrays.sort(intArray1);
//        System.out.println(intArray1);
        System.out.println(Arrays.toString(intArray1));
    }
}
