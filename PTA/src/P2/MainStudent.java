package P2;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Student one = new Student();
        Scanner in= new Scanner(System.in);
        one.display();
        one.setName(in.next());
        one.setAge(in.nextInt());
        one.display();
    }
}
