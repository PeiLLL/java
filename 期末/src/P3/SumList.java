package P3;

import java.util.ArrayList;
import java.util.Scanner;

public class SumList extends Thread{
        private ArrayList<Integer> lt=null;//整数序列
        private int sum; //序列和
        SumList(ArrayList<Integer> lt){ this.lt=lt; }
        //返回求和结果值
        public int getSum() { return sum; }
        //线程体
        public void run() {//线程类必须重写 run() 方法
            sum=0;
            for (int i = 0; i < lt.size(); i++) sum=sum+lt.get(i);
        }
    }


