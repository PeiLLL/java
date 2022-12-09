package test;

import java.util.ArrayList;
import java.util.Random;

//定义以指定格式打印集合的方法(ArrayList类型作为参数),使用{}扩起集合，使用@分割每个元素。
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random ra = new Random();
        for(int i = 0; i < 6; i++) {
            int r = ra.nextInt(100);
            list.add(r);
        }
        printList(list);
    }
    public static void printList(ArrayList list){
        System.out.print("{ ");
        for(int j = 0; j<list.size(); j++) {
            System.out.print(list.get(j) + " @ ");
        }
        System.out.println(" }");
    }
}
