package test;

import java.util.Scanner;

/*
��������һ���ַ���������ͳ�����и����ַ����ֵĴ���
 */
public class Demo06 {
    public static void main(String[] args) {
        System.out.println("������һ���ַ�����");
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
        System.out.println("�ַ����еĴ�д��ĸ�У�"+big+"��");
        System.out.println("�ַ����е�Сд��ĸ�У�"+small+"��");
        System.out.println("�ַ����е������У�"+num+"��");
        System.out.println("�����ַ��У�"+other+"��");
    }
}
