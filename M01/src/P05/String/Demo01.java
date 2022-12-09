package P05.String;

import java.util.concurrent.SynchronousQueue;

/*
创建字符串的常见3+1种方式：
三种构造方法：
public String();创建一个空白字符串，不含有任何内容
public String(char[] array);根据字符数组的内容，来创建对应的字符串
public String(byte[] array);根据字节数组的内容，来创建对应的字符串

一种直接创建：
 */
public class Demo01 {
    public static void main(String[] args) {
        String str1 = new String();//括号为空，没有内容
        System.out.println(str1);
        //根据字符数组创建字符串
        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);
        System.out.println(str2);
        //根据字节数组创建字符串
        byte[] byteArray = {99,98,97};
        String str3 = new String(byteArray);
        System.out.println(str3);

        //直接创建
        String str4 = "hello";
        System.out.println(str4);
    }
}
