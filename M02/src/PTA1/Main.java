package PTA1;


import java.util.*;
public class Main {

    public static void main(String[] args) {
        double s=0;
        Scanner sc=new Scanner(System.in);
        double r1,r2;
        r1=sc.nextDouble();
        r2=sc.nextDouble();
        Circle c1=new Circle(r1);
        Circle c2=new Circle(r2);
        try{
            s = c1.area();
            System.out.println(s);
            s = c2.area();
            System.out.println(s);
        }
        catch (CircleException e){
            e.print();
        }
    }
}


/* ����������д�� ��дCircle ��CircleException��*/
