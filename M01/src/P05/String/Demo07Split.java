package P05.String;
/*
public String[] split(String regex);���ղ����Ĺ��򣬽��ַ����зֳ�Ϊ���ɲ���
ע�⣺�������Ӣ�ľ�㡰.�������з֣�����д��\\."
 */
public class Demo07Split {
    public static void main(String[] args) {
        String str1 = "aa,ba,ba,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("------------------");

        String str2 = "ab cd ef";
        String[] array2 = str2.split(" ");
        for (int j = 0; j < array2.length; j++) {
            System.out.println(array2[j]);
        }
        System.out.println("-----------------");

        String str3 = "XX.YY.ZZ";
        String[] array3 = str3.split("\\.");
        for (int k = 0; k < array3.length; k++) {
            System.out.println(array3[k]);
        }
    }
}
