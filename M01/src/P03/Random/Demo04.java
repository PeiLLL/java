package P03.Random;

import java.util.Random;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        int r = new Random().nextInt(100);
        Scanner sc = new Scanner(System.in);
        while(true){
            int ges = sc.nextInt();
            if(ges == r){
                System.out.println("恭喜你答对了！");
            }
            else if(ges < r){
                System.out.println("小了");
            }
            else if(ges > r){
                System.out.println("大了");
            }
        }
    }
}
