package P05.String;

/*
== �ǽ��ж���ĵ�ֵַ�Ƚϣ����ȷʵ��Ҫ�ַ��������ݱȽϣ�����ʹ����������
public boolean equals(Object obj); �����������κζ���ֻ�в�����һ���ַ�������������ͬ�Ĳ���true
 �Ƽ�"abc".equals(str);   ������str.equals("abc");
 */
public class Demo03Equals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));

        String stra = "Java";
        String strb = "java";

        System.out.println(stra.equals(strb));//false �ϸ����ִ�Сд
        System.out.println(stra.equalsIgnoreCase(strb));//true �����ִ�Сд
    }

}
