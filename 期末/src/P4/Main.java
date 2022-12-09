package P4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Factory factory=new Factory();
        Scanner input=new Scanner(System.in);
        int type=input.nextInt();
        String name=input.next();
        int age=input.nextInt();
        int ownAttribute=input.nextInt();
        Animal a=factory.getAnimalByType(type, name, age, ownAttribute);
        a.info();
        a.speak();
        System.out.println(a.getName());
        System.out.println(a.getAge());
        input.close();
    }
}

/*请在这里填写你编写的Dog类、Cat类和Factory类 */
