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
            double result=computer.average(a); //computer����average(double x[])������������a���ݸ�����x
            //System.out.printf("%n");
            System.out.printf("���ѡ�����÷�:%5.3f\n",result);
            computer=new School();
            result=computer.average(b); //computer����average(double x[])������������b���ݸ�����x
            System.out.printf("�༶����ƽ������:%-5.2f",result);
       }
    }

