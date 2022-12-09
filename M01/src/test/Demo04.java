package test;

import java.util.ArrayList;
import java.util.Random;

//题目：用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中
//要求使用自定义的方法来实现筛选
public class Demo04 {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random ra = new Random();
        for (int i = 0; i < 20; i++) {
            int r = ra.nextInt(100)+1;
            biglist.add(r);
            System.out.print(biglist.get(i)+" ");
        }
        System.out.println();
        ArrayList<Integer> littlelist = getSmallList(biglist);
        for (int k = 0; k < littlelist.size(); k++) {
            System.out.print(littlelist.get(k)+" ");
        }
    }
    public static ArrayList getSmallList(ArrayList<Integer> biglist){
        ArrayList<Integer> littlelist = new ArrayList<>();
        for (int j = 0; j < biglist.size(); j++) {
            int num = biglist.get(j);
            if(num % 2 == 0){
                littlelist.add(num);
            }
        }
        return littlelist;
    }

}
