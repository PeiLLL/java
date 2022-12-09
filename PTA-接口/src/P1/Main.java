package P1;

import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
            double a[] ;
            double b[];
            Scanner sc=new Scanner(System.in);
            String str1=sc.nextLine();
            String[] str_a=str1.split(" ");
            a=new double[str_a.length];
            for(int i=0;i<str_a.length;i++)
                a[i]=Double.parseDouble(str_a[i]);
            String str2=sc.nextLine();
            String[] str_b=str2.split(" ");
            b=new double[str_b.length];
            for(int i=0;i<str_b.length;i++)
            b[i]=Double.parseDouble(str_b[i]);
            ComputerAverage computer;
            computer=new Gymnastics();
            double result=computer.average(a); //computer调用average(double x[])方法，将数组a传递给参数x
            //System.out.printf("%n");
            System.out.printf("体操选手最后得分:%5.3f\n",result);
            computer=new School();
            result=computer.average(b); //computer调用average(double x[])方法，将数组b传递给参数x
            System.out.printf("班级考试平均分数:%-5.2f",result);
       }
    }

