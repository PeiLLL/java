package P05.String;
/*
字符串常量池；程序当中直接写上的双引号字符串，就在字符串常量池中
对已基本类型来说， ==是进行数值的比较
对于引用类型来说， ==是进行地址值的比较
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
