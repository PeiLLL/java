package test;

import java.util.Scanner;

/*
键盘输入一个字符串，并且统计其中各种字符出现的次数
 */
public class Demo06 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        String str = new Scanner(System.in).next();
        int big=0,small=0,num=0,other=0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] <= 'Z' && ch[i] >= 'A' )
                big++;
            else if(ch[i] >= 'a' && ch[i] <= 'z')
                small++;
            else if(ch[i] >= '0' && ch[i] <= '9')
                num++;
            else
                other++;
        }
        System.out.println("字符串中的大写字母有："+big+"个");
        System.out.println("字符串中的小写字母有："+small+"个");
        System.out.println("字符串中的数字有："+num+"个");
        System.out.println("其他字符有："+other+"个");
    }
}
