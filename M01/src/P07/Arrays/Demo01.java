package P07.Arrays;
/*
public static.Arrays

public static String toString   �������ַ���
public static void sort(������)    ��������
 */
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        int[] Array = new int[0];
        String str = Arrays.toString(Array);//����Ĭ�ϸ�ʽ���������ַ���
        System.out.println(str);//[10, 20, 30]

        int[] array1 = {1,2,412,4111,452,1};
        Arrays.sort(array1);
        System.out.println(Array.length);
        System.out.println(Arrays.toString(array1));

    }
}
