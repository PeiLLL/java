package P05.String;

import javax.sql.rowset.spi.SyncResolver;

/*
public String substring(int index);��ȡ�Ӳ���λ��һֱ���ַ���ĩβ���������ַ���
public String substring(int begin, int end);��ȡ��begin��ʼ��һֱ��end�������м���ַ���
 */
public class Demo05Sub {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("--------------------");
        String str3 = str1.substring(4,7);
        System.out.println(str3);

        //��������д���ַ�������û�иı�
        //�������ַ�����java hello
        //stra�б�����ǵ�ֵַ
        //������ֵַ�Ǵ��hello�ģ�������ֵַ�����java��
        String stra = "hello";
        System.out.println(stra);
        stra = "java";
        System.out.println(stra);
    }
}
