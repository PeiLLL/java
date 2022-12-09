package P04.ArrayList;

import java.util.ArrayList;

/**
 * demo02
 *
 * @author llq
 * @date 2022/11/28


队对于Arraylist来说，有一个尖括号<E>代表泛型
泛型；装在集合当中的所有元素，全都是统一的什么类型
（泛型只能是引用，不能是基本类型。
 */
public class Demo02{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("join");
        list.add("jay");
        System.out.println(list);
    }
}
