package P3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();//输入序列中的整数个数
        ArrayList<Integer> lt=new ArrayList<Integer>();
        for (int j = 0; j < m; j++) lt.add(sc.nextInt());//输入序列
        SumList sum=new SumList(lt);//创建线程对象

        sum.start();//启动线程

         sum.join();//等待线程结束
        System.out.println(sum.getSum());//输出求和结果
    }
}