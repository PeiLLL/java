package P1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IAbility animal=null;
        int type=input.nextInt();
        String name=input.next();
        int age=input.nextInt();
        if (type==1)
            animal=new Dog(name,age);
        else
            animal=new Cat(name,age);

        Simulator sim=new Simulator();
        sim.playSound(animal);
        input.close();
    }
}
