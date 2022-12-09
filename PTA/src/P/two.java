package P;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        int a;
        String s;
        int b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        s = in.next();
        b = in.nextInt();
        int re;
        switch (s){
            case "&":
                System.out.println(a+" "+"&"+" "+b+" "+"="+" "+(a&b));
                break;
            case "|":
                System.out.println(a+" "+"|"+" "+b+" "+"="+" "+(a|b));
                break;
            case "^":
                System.out.println(a+" "+"^"+" "+b+" "+"="+" "+(a^b));
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
