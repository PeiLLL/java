package P04.ArrayList;

import java.util.ArrayList;

/**
������򼯺�ArrayList�д��������������ݣ�����ʹ�û������Ͷ�Ӧ�ġ���װ�ࡰ
��������    ��Ӧ�İ�װ��(�������ͣ���װ�඼λ��java.lang���£�
byte        Byte
short       Short
int         Integer
long        Long
float       Float
double      Double
char        Character
boolean     Boolean
 * @author 15832
 */

public class Demo05 {
    public static void main(String[] args) {
        //ArrayList<String> = new ArrayList<>();
        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);
        System.out.println(listC.size());
    }
}
