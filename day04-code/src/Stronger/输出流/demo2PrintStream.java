package Stronger.输出流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class demo2PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("在控制台输出");

        PrintStream ps = new PrintStream("D:\\basic-code\\day04-code\\src\\Stronger\\输出流\\wow.txt");

        System.setOut(ps);//把输出语句sout的目的地改为打印流的目的地

        System.out.println("我在打印流的目的地中输出");

        ps.close();
    }
}
