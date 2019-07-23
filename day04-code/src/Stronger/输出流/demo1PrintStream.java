package Stronger.输出流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class demo1PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\basic-code\\day04-code\\src\\Stronger\\输出流\\print.txt");
        //如果使用继承父类的write方法写数据，那么查看数据的时候会查询编码表
        ps.write(97);
        //如果使用自己独有的方法print/println方法写数据,原样输出
        ps.println(97);
    }
}
