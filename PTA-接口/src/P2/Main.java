package P2;


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            ComputerWeight[] goods=new ComputerWeight[650]; //650������
            double[] a=new double[3];//�洢Television,Computer,WashMachine����weight���Գ�ֵ
            Scanner sc=new Scanner(System.in);
            String str1=sc.nextLine();
            String[] str_a=str1.split(" ");
            for(int i=0;i<3;i++)
                a[i]=Double.parseDouble(str_a[i]);
            for(int i=0;i<goods.length;i++) { //�򵥷ֳ�����
                if(i%3==0)
                    goods[i]=new Television(a[0]);
                else if(i%3==1)
                    goods[i]=new Computer(a[1]);
                else if(i%3==2)
                    goods[i]=new WashMachine(a[2]);
            }
            Truck truck=new Truck(goods);
            System.out.printf("����װ�صĻ�������:%-8.5f kg\n",truck.getTotalWeights());
            goods=new ComputerWeight[68]; //68������
            for(int i=0;i<goods.length;i++) { //�򵥷ֳ�����
                if(i%2==0)
                    goods[i]=new Television(a[0]);
                else
                    goods[i]=new WashMachine(a[2]);
            }
            truck.setGoods(goods);
            System.out.printf("����װ�صĻ�������:%-8.5f kg\n",truck.getTotalWeights());
        }
    }

