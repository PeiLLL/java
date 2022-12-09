package P2;

import java.util.Scanner;

public class MainRing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Ring r1 = new Ring(in.nextInt(),in.nextInt());
        System.out.println(r1.getArea());

        Ring r2 = new Ring();
        System.out.println(r2.getArea());
    }
}
