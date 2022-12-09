package P2;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.toSting());
        System.out.println("c1:area="+c1.getArea());

        Circle c2 = new Circle();
        System.out.println(c2.toSting());
        Scanner in = new Scanner(System.in);
        c2.setRadius(in.nextInt());
        System.out.println(c2.toSting());
        System.out.println("c2:area="+c2.getArea());

        Circle c3 = new Circle(in.nextInt());
        System.out.println(c3.toSting());
        System.out.println("c3:area="+c3.getArea());

    }
}
