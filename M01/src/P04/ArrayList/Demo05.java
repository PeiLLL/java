package P04.ArrayList;

import java.util.ArrayList;

/**
如果想向集合ArrayList中存贮基本类型数据，必须使用基本类型对应的”包装类“
基本类型    对应的包装类(引用类型，包装类都位于java.lang包下）
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
