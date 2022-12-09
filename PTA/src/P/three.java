package P;

import java.sql.SQLOutput;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        int M,N;
        Scanner in = new Scanner(System.in);

        while (true){
            M = in.nextInt();
            N = in.nextInt();
            show(M,N);
        }
    }
    public static void show(int a,int b){
        int min,max;
        if(a>b){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }
        int maxY,minB;
        for(maxY = max; maxY >= 1; maxY--){
            if(a % maxY == 0 && b % maxY == 0){
                System.out.print(maxY);
                System.out.print(" ");
                break;
            }
        }
        for(minB = max; ; minB++){
            if(minB % a == 0 && minB % b == 0){
                System.out.print(minB);
                System.out.println();
                break;
            }
        }

    }
}
