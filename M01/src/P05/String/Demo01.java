package P05.String;

import java.util.concurrent.SynchronousQueue;

/*
�����ַ����ĳ���3+1�ַ�ʽ��
���ֹ��췽����
public String();����һ���հ��ַ������������κ�����
public String(char[] array);�����ַ���������ݣ���������Ӧ���ַ���
public String(byte[] array);�����ֽ���������ݣ���������Ӧ���ַ���

һ��ֱ�Ӵ�����
 */
public class Demo01 {
    public static void main(String[] args) {
        String str1 = new String();//����Ϊ�գ�û������
        System.out.println(str1);
        //�����ַ����鴴���ַ���
        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);
        System.out.println(str2);
        //�����ֽ����鴴���ַ���
        byte[] byteArray = {99,98,97};
        String str3 = new String(byteArray);
        System.out.println(str3);

        //ֱ�Ӵ���
        String str4 = "hello";
        System.out.println(str4);
    }
}
