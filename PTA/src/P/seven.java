package P;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int result = 32;
        if (a > 0) {
            while (a > 0){
                a /= 2;
                result--;
            }
        }
        else if (a < 0)
            result = 0;
        System.out.println(result);
    }

}
