package P3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();//���������е���������
        ArrayList<Integer> lt=new ArrayList<Integer>();
        for (int j = 0; j < m; j++) lt.add(sc.nextInt());//��������
        SumList sum=new SumList(lt);//�����̶߳���

        sum.start();//�����߳�

         sum.join();//�ȴ��߳̽���
        System.out.println(sum.getSum());//�����ͽ��
    }
}