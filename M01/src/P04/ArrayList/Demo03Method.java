package P04.ArrayList;

import java.util.ArrayList;

/*
8
ArrayList中的常用方法有
1：public boolean add(E e);向集合中添加元素，参数的类型和泛型一直
2；public E get(int index);从集合当中获取元素，参数是索引编号，返回值是对应位置的元素
3；public E remove(int index);从集合当中删除元素，参数是索引编号。返回值就是被删除的元素
4；public int size();获取集合的尺寸长度，返回值就是集合中包含的元素个数
 */
public class Demo03Method {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean success = list.add("林俊杰");
        System.out.println(list);
        System.out.println("添加的操作是否成功："+success);
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        //从集合中获取元素
        String name = list.get(2);
        System.out.println("第二号索引位置:"+name);
        //从集合中删除元素
        String remove = list.remove(3);
        System.out.println("被删除的人是谁："+remove);
        System.out.println(list);
        //获取集合长度
        int size = list.size();
        System.out.println("集合的长度是："+size);
    }
}
