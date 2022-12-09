package P01;

import java.util.Scanner;

public class Learn {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,41};
        int[] arraya = new int[4];
        Scanner input= new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            arraya[i] = input.nextInt();
            }
        for (int j = 3; j>=0; j--) {
            System.out.print(arraya[j]+" ");
        }
        }
    }



