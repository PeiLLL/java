package P05.String;

import javax.sql.rowset.spi.SyncResolver;

/*
public String substring(int index);截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin, int end);截取从begin开始，一直到end结束，中间的字符串
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

        //下面这种写法字符串内容没有改变
        //有两个字符串：java hello
        //stra中保存的是地址值
        //本来地址值是存的hello的，后来地址值变成了java的
        String stra = "hello";
        System.out.println(stra);
        stra = "java";
        System.out.println(stra);
    }
}
