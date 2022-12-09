package P;

import java.util.Scanner;

import static java.lang.Math.pow;

public class four {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int c = a;
        int b=0;
        int count = 0;
        while (true) {
            a /= 10;
            count++;
            if (a / 10 == 0) {
                count++;
                break;
            }
        }
        int d = c;
        for(int i = count-1; i>=0; i--) {
            b += (c % 10) * (pow(10, i));
            c /= 10;
        }
        System.out.println(count);
        if(b == d)
        System.out.println("Y");
        else
            System.out.println("N");
    }
}