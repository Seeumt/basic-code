package cn.itcast.day04.Jun0201demo;

import java.io.File;

/**
 * java.io.File类
 * 文件和目录路径名的抽象表示形式
 * java把电脑中的文件和文件夹（目录），封装为了一个File类，我们可以使用File类对文件进行操作
 * File的方法;=====创建=====、=====删除=====、=====获取=====、====判断文件夹是否存在====、=====对文件夹进行遍历（看有什么内容）
 * File类是一个与系统无关的类。任何的操作系统都可以使用这个类中的方法
 *
 * 重点：记住三个单词
 * file :文件
 * directory:文件夹/目录
 * path：路径
 */
//===============File类的静态成员变量==================
/**
 * 操作路径不要写死
 * C:\develop\a\a.txt windows
 * C:/develop/a/a.txt linux
 * "C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
 */

/**
 * 绝对路径：是一个完整的路径，以盘符开始
 * 相对路径：相对于当前项目的根目录     如果使用当前项目的根目录，路径可以简化书写
 * ===================根目录的“绝对路径不用写了” ，直接写了该文件名称加后缀
 *
 * Attention: 路径不区分大小写
 *            由于\是转义字符 所以要使用俩\\
 */


public class Filedemo01 {
    public static void main(String[] args) {
        /*------静态成员变量---------通过类名访问------*/
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符 Windows是分号 Linux是冒号
        String seperator = File.separator;
        System.out.println(seperator);//文件名称分隔符 Windows是反斜杠 Linux是正斜杠
    }
}
