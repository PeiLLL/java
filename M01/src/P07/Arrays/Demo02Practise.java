package P07.Arrays;

import java.util.Arrays;

public class Demo02Practise {
    public static void main(String[] args) {
        String str = "alsdjasldja";
        //��������sort ������һ�����飬String -->����,��toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
