package P05.String;
/*
�ַ��������أ�������ֱ��д�ϵ�˫�����ַ����������ַ�����������
���ѻ���������˵�� ==�ǽ�����ֵ�ıȽ�
��������������˵�� ==�ǽ��е�ֵַ�ıȽ�
 */
public class Demo02 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] array = {'a','b','c'};
        String str3 = new String(array);

        System.out.println(str1 == str2);
        System.out.println(str3 == str1);
        System.out.println(str2 == str3);

    }
}
