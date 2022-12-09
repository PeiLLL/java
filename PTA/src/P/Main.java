package P;

import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int data=in.nextInt();
            System.out.println(isOdd(data));
        }

        public static boolean isOdd(int data){
             if(data%2 == 0){
                 return true;
             }
             else
                 return false;
        }


    }



