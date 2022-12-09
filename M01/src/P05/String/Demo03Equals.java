package P05.String;

/*
== 是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法
public boolean equals(Object obj); 参数可以是任何对象，只有参数是一个字符串并且内容相同的才是true
 推荐"abc".equals(str);   而不是str.equals("abc");
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

        System.out.println(stra.equals(strb));//false 严格区分大小写
        System.out.println(stra.equalsIgnoreCase(strb));//true 不区分大小写
    }

}
