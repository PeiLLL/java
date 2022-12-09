package P4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        switch(i) {
            case 1:     //Éî¿½±´
                CarDriver cd=new CarDriver();
                Car c1=new Car();
                c1.setDriver(cd);
                cd.setName("d1");
                c1.setName("car1");
                int[] s=new int[2];
                c1.setScores(s);
                Car d1=(Car)c1.clone();
                System.out.println("c1:"+(c1==d1)+" driver:"+(c1.getDriver()==d1.getDriver())+" scores:"+(c1.getScores()==d1.getScores()));
                System.out.println(c1.toString()+" "+d1.getName()+" "+d1.getDriver().getName());
                break;
            case 2: //
                Car c2=new Car();
                Car d2=(Car)c2.clone();
                System.out.println("c2:"+(c2==d2)+" driver:"+c2.getDriver()+" "+(c2.getDriver()==d2.getDriver())+" scores:"+c2.getScores()+" "+(c2.getScores()==d2.getScores()));
                break;
            case 3:
                CarDriver cd1=new CarDriver();
                Car c3=new Car();
                c3.setDriver(cd1);
                Car d3=(Car)c3.clone();
                System.out.println("c3:"+(c3==d3)+" driver:"+c3.getDriver()+" "+(c3.getDriver()==d3.getDriver())+" scores:"+c3.getScores()+" "+(c3.getScores()==d3.getScores()));
                break;
            case 4:
                //CarDriver cd3=new CarDriver();
                Car c4=new Car();
                //c4.setDriver(cd3);
                int[] s1=new int[2];
                c4.setScores(s1);
                Car d4=(Car)c4.clone();
                System.out.println("c4:"+(c4==d4)+" driver:"+c4.getDriver()+" "+(c4.getDriver()==d4.getDriver())+" scores:"+" "+(c4.getScores()==d4.getScores()));
                break;

        }
    }
}
