package Stronger.File类;

import java.io.File;

public class demo06File {
    public static void main(String[] args) {
        show02();
        show01();
    }

    private static void show02() {
        File f2 = new File("D:\\basic-code\\day04-code\\src\\Stronger");
        File[] listFiles = f2.listFiles();
        for (File listFile : listFiles) {
            System.out.println(listFile);
        }

    }

    private static void show01() {
        File f1 = new File("D:\\basic-code\\day04-code\\src\\");
        String[] list = f1.list();//  遍历File目录中的子文件夹或者目录,还可获得隐藏的
                                    //但没有子文件夹里的东西，不可多级遍历
        for (String s : list) {
            System.out.println(s);
        }
    }
}
