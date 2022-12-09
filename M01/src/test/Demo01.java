package test;

//生成6个1-33之间的随机整数，添加到集合，并遍历集合

import java.util.ArrayList;
import java.util.Random;

/**
 * demo01
 *
 * @author llq
 * @date 2022/11/28
 */
public class Demo01 {
    public static void main(String[] args) {
        Random ra = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int r = ra.nextInt(33)+1;
            list.add(r);
        }

        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j)+" ");
        }
    }
}
