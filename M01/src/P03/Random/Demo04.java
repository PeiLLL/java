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
                System.out.println("��ϲ�����ˣ�");
            }
            else if(ges < r){
                System.out.println("С��");
            }
            else if(ges > r){
                System.out.println("����");
            }
        }
    }
}
