package cn.itcast.day04.May1801demo;

/**分隔字符串的方法：
 * public String[] split(String regex)
 *
 */
public class StringSplitdemo {
    public static void main(String[] args) {
//        String str1 = "aaa.bbb.ccc.ddd";
//        String[] string1 = str1.split(".");
//        for (int i = 0; i < string1.length; i++) {
//            System.out.println(string1[i]);
//        }
        String str1 = "aaa.bbb.ccc.ddd";
        String[] string1 = str1.split("\\.");
        for (int i = 0; i < string1.length; i++) {
            System.out.println(string1[i]);
        }
        String str2 = "aaaxbbbxcccxddd";
        String[] string2 = str2.split("x");
        for (int i = 0; i < string2.length; i++) {
            System.out.println(string2[i]);
        }
        String str3 = "aaa bbb ccc ddd";
        String[] string3 = str3.split(" ");
        for (int i = 0; i < string3.length; i++) {
            System.out.println(string3[i]);
        }

   }
}
