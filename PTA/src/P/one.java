package P;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        int F;
        int vMax;
        int v;
        int more;
        Scanner in = new Scanner(System.in);
        vMax = in.nextInt();
        v = in.nextInt();
        more = v-vMax;
        if(v<=vMax){
            System.out.println("Congratulations, you are within the speed limit!");
        }
        else {
            if(more >= 1 && more <= 20){
                F = 100;
                System.out.println("You are speeding and your fine is "+F+".");
            }
            else if(more >= 21 && more <= 30){
                F = 270;
                System.out.println("You are speeding and your fine is "+F+".");
            }
            else{
                F = 500;
                System.out.println("You are speeding and your fine is "+F+".");
            }
        }
    }
}



