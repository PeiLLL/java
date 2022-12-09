package P1;

import java.util.Scanner;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            String str = input.next();
            if(str.equals("Circle")) {
                Circle c = new Circle(input.nextDouble());
                System.out.println("The area of " + c.toString() + " is " + String.format("%.2f",c.getArea()));
                System.out.println("The perimeter of " + c.toString() + " is "+ String.format("%.2f",c.getPerimeter()));
            } else if(str.equals("Cone")) {
                Cone r = new Cone(input.nextDouble(), new Circle(input.nextDouble()));
                System.out.println("The volume of " + r.toString() + " is " + String.format("%.2f",r.getVolume()));
            }
        }
    }

}

/* 请在这里填写答案 */
