package PTA1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Mian1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee[] a = new Employee[3];
        a[0] = new Manager(in.nextInt());
        a[1] = new Salesman(in.nextInt(),in.nextInt());
        a[2] = new Worker(in.nextInt(),in.nextInt());

        for(int i =0; i<3; i++){
            System.out.println(a[i].getSalary());
        }

    }
}

