package P3;

import java.util.ArrayList;
import java.util.Scanner;

public class SumList extends Thread{
        private ArrayList<Integer> lt=null;//��������
        private int sum; //���к�
        SumList(ArrayList<Integer> lt){ this.lt=lt; }
        //������ͽ��ֵ
        public int getSum() { return sum; }
        //�߳���
        public void run() {//�߳��������д run() ����
            sum=0;
            for (int i = 0; i < lt.size(); i++) sum=sum+lt.get(i);
        }
    }


