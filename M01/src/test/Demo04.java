package test;

import java.util.ArrayList;
import java.util.Random;

//��Ŀ����һ���󼯺ϴ���20��������֣�Ȼ��ɸѡ���е�ż��Ԫ�أ��ŵ�С���ϵ���
//Ҫ��ʹ���Զ���ķ�����ʵ��ɸѡ
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
