package P2;

import java.util.Scanner;

public class MainSquare {
    public static void main(String[] args) {
        Square s1 = new Square();
        Scanner in = new Scanner(System.in);
        System.out.println("s1:edge="+s1.getEdge());
        System.out.println("s1:area="+s1.getArea());

        Square s2 = new Square();
        s2.setEdge(in.nextInt());
        System.out.println("s2:edge="+s2.getEdge());
        System.out.println("s2:area="+s2.getArea());
    }
}
