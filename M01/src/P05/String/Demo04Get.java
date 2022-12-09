package P05.String;

import java.util.Scanner;

/*
public int length();获取字符串当中含有字符个数，拿到字符串长度
public String concat(String str);将当前字符串和参数字符串拼接成为返回值新的字符串
public char charAt(int index);互殴指定索引位置的单个字符。（索引从0开始）
public int indexOf(String str);查找参数字符串在本字符串当中首次出现的索引位置，如果没有，返回-1值
 */
public class Demo04Get {
    public static void main(String[] args) {
        int length = "ashldfhasljfghsald".length();
        System.out.println(length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String  str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //获取指定索引位置的单个字符

        String a = new Scanner(System.in).next();

        char ch = a.charAt(0);
        System.out.println("在一号所位置的是："+ch);
        System.out.println("----------------");

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果没有，返回-1
        String original = "HelloWorld";
        int index = original.indexOf("ll5");
        System.out.println("第一次索引值是："+index);
    }
}
