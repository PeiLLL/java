package P05.String;
/*
public char[] toCharArray();将当前字符串拆分成为字符数组作为返回值
public byte[] getBytes();获得当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString);将所有出现的老字符串替换成为新的字符串，返回替换后的结果新字符串

 */
public class Demo06Convert {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("----------------");

        //转换成为字节数组
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

        String stra = "你他妈的";
        String strb = stra.replace("他妈","**");
        System.out.println(strb);
    }
}
