package P10;

import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double r=input.nextDouble();
        double h=input.nextDouble();
        IShape[] is=new IShape[2];
        is[0]=new RTriangle(a,b);
        is[1]=new Circle(r);
        Cone cn1;
        for(int i=0;i<2;i++) {
            cn1=new Cone(is[i],h);
            String vol=String.format("%.2f", cn1.getVolume());
            String p=String.format("%.2f",is[i].getPerimeter());
            System.out.println("Volume"+i+"="+vol+" Perimeter="+p);
        }
    }
}
/* 将其他代码填写在下面 */
