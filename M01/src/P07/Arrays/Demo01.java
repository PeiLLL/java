package P07.Arrays;
/*
public static.Arrays

public static String toString   数组变成字符串
public static void sort(数组名)    数组排序
 */
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        int[] Array = new int[0];
        String str = Arrays.toString(Array);//按照默认格式将数组变成字符串
        System.out.println(str);//[10, 20, 30]

        int[] array1 = {1,2,412,4111,452,1};
        Arrays.sort(array1);
        System.out.println(Array.length);
        System.out.println(Arrays.toString(array1));

    }
}
