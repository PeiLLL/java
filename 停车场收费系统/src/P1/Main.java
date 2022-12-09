package P1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car c = new Car(4,78);
        c.setPrice(sc.nextFloat());
        c.setMinute(sc.nextInt());
        System.out.printf("Car fee:%.2f\n",c.computeFee());
        Bus b = new Bus();
        b.setPrice(sc.nextFloat());
        b.setMinute(sc.nextInt());
        b.setSeats(sc.nextInt());
        System.out.printf("Bus seats:%d,fee:%.2f\n",b.getSeats(),b.computeFee());
    }
}

