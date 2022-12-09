package P07.Arrays;

import java.util.Arrays;

public class Demo02Practise {
    public static void main(String[] args) {
        String str = "alsdjasldja";
        //升序排列sort 必须是一个数组，String -->数组,用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
