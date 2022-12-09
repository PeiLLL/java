package P01;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args){
//PTA-7-6
       /* double HUAS;
        HUAS = 5*(100-32)/9.0;
        System.out.println("100 "+String.format("%.2f",HUAS));*/

//PTA-7-7
       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);*/

//PTA-7-8
      /*  double PI=0;
        int x = 1;
        for (int i = 0; i < 13; i++) {
            i++;
            x++;
            PI += 4*((1.0/i)*pow((-1),x));
        }
        System.out.println(PI);*/
//PTA-7-9
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b,c;
        System.out.println(a%100/10+a/100+a%10);*/

//PTA-7-10
       /* Scanner sc = new Scanner(System.in);
        double m,s;
        double d;
        m = sc.nextInt();
        s = sc.nextInt();
        d = sc.nextInt();
        double v;
        v = (d/1.6)/(((s/60)+m)/60);
        System.out.println(String.format("%.2f",v));*/

//PTA-7-11
       /* int a,b;
        Scanner sc = new Scanner(System.in);;
        a = sc.nextInt();
        b = sc.nextInt();
        double sum = a+b;
        System.out.print(String.format("%.2f",a/sum*100));
        System.out.print("%");
        System.out.print(" ");
        System.out.print(String.format("%.2f",b/sum*100));
        System.out.print("%");*/

//PTA-R7-1输出月份
       /* int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        switch(a){
            case(0):
                System.out.println("一月份");
                break;
            case(1):
                System.out.println("二月份");
                break;
            case(2):
                System.out.println("三月份");
                break;
            case(3):
                System.out.println("四月份");
                break;
            case(4):
                System.out.println("五月份");
                break;
            case(5):
                System.out.println("六月份");
                break;
            case(6):
                System.out.println("七月份");
                break;
            case(7):
                System.out.println("八月份");
                break;
            case(8):
                System.out.println("九月份");
                break;
            case(9):
                System.out.println("十月份");
                break;
            case(10):
                System.out.println("十一月份");
                break;
            case(11):
                System.out.println("十二月份");
                break;
        }*/
//PTA-R7-4
       /* Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w=0;
        if(h<=0)    w = 0;
        else if(h<=120){
            w = h*20;
        }
        else{
            w = 120*20+(h-120)*40;
        }
        System.out.println(w);*/

//PTA-R7-5java中二进制位运算

//PTA-R7-6
        /*Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();
        if(year%4 == 0 && month == 2){
            System.out.println(29);
        }
        else if(year%4 != 0 && month == 2)
            System.out.println(28);
        else if(month<8 && month%2 == 0)
            System.out.println(30);
        else if(month<8 && month%2 != 0)
            System.out.println(31);
        else if(month>8 && month%2 == 0)
            System.out.println(31);
        else System.out.println(30);
*/

//PTA-R7-7

//PTA-R7-8
   /*     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a[] = new char[26];
        if(n == 1){
            System.out.println('a');
        }
        else{
            for(int i = 0; i< n; i++){
                a[i] = (char)('a'+i);
                System.out.print(a[i]+" ");
            }
            for(int i = n-2 ;i> 0; i--){
                System.out.print(a[i]+" ");
            }
            System.out.println(a[0]);
        }
*/

//PTA-R7-9
     /*   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double a[] = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        double max = 0, min = 0;
        for (int j = 0; j < n; j++) {
            if(max<a[j]){
                max = a[j];
            }

        }min = max;
        for (int g = 0; g < n; g++) {
            if(min>a[g]){
                min = a[g];
            }
        }
        for (int k= 0;  k< n; k++) {
            sum += a[k];
        }
        System.out.println(String.format("%.2f",((sum-max-min)/(n-2))));
        System.out.println(max);
        System.out.println(min);
*/

//PTA-R7-10

             /*   Scanner input = new Scanner(System.in);
                int n=input.nextInt();
                for(int i=1;i<=n;++i) {
                    for(int j=1;j<=i;++j) {
                        System.out.print("*");
                    }
                    System.out.println();
                }*/

//PTA分解平方根
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j=0,c;
        while(true){
            j++;
            if(j == sqrt(n)){
                System.out.print(j+" ");
                System.out.println(1);
                break;
            }
            else if(j>sqrt(n)){
                System.out.print((int)sqrt(j-1)+" ");
                System.out.println(n/(j-1));
                break;
            }
        }




 /*       Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []arr = str.split("\\s+");
        int a = Integer.parseInt(arr[0]);
        int c = Integer.parseInt(arr[2]);
        switch (arr[1]){
            case"&":
                System.out.println(a+" & "+c+" = "+(a&c));
                break;
            case"|":
                System.out.println(a+" | "+c+" = "+(a|c));
                break;
            case"^":
                System.out.println(a+" ^ "+c+" = "+(a^c));
                break;
            default:
                System.out.println("ERROR");
                break;

        }
*/













































    }
}
