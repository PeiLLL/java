package P05.String;

import java.util.Scanner;

/*
public int length();��ȡ�ַ������к����ַ��������õ��ַ�������
public String concat(String str);����ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ�µ��ַ���
public char charAt(int index);��Źָ������λ�õĵ����ַ�����������0��ʼ��
public int indexOf(String str);���Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�ã����û�У�����-1ֵ
 */
public class Demo04Get {
    public static void main(String[] args) {
        int length = "ashldfhasljfghsald".length();
        System.out.println(length);

        //ƴ���ַ���
        String str1 = "Hello";
        String str2 = "World";
        String  str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //��ȡָ������λ�õĵ����ַ�

        String a = new Scanner(System.in).next();

        char ch = a.charAt(0);
        System.out.println("��һ����λ�õ��ǣ�"+ch);
        System.out.println("----------------");

        //���Ҳ����ַ����ڱ����ַ������г��ֵĵ�һ������λ��
        //���û�У�����-1
        String original = "HelloWorld";
        int index = original.indexOf("ll5");
        System.out.println("��һ������ֵ�ǣ�"+index);
    }
}
