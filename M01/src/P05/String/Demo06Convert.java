package P05.String;
/*
public char[] toCharArray();����ǰ�ַ�����ֳ�Ϊ�ַ�������Ϊ����ֵ
public byte[] getBytes();��õ�ǰ�ַ����ײ���ֽ�����
public String replace(CharSequence oldString,CharSequence newString);�����г��ֵ����ַ����滻��Ϊ�µ��ַ����������滻��Ľ�����ַ���

 */
public class Demo06Convert {
    public static void main(String[] args) {
        //ת����Ϊ�ַ�����
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("----------------");

        //ת����Ϊ�ֽ�����
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("-------------------");

        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("--------------");

        String stra = "�������";
        String strb = stra.replace("����","**");
        System.out.println(strb);
    }
}
