package test;
//定义一个方法，把数组（1，2，3）按照指定格式斌结成一个字符串。格式参照如下【word1#word2#word3】
public class Demo05 {
    public static void main(String[] args){
        int[] array = {1,2,3};

        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i != array.length-1)
                str += "word" + array[i] + "#";
            else
                str += "word" + array[i] + "]";
        }
        return str;
    }
}
