package P2;
import java.util.Scanner;
public class one {
    public one(){
        System.out.println("���췽��һ��������");
    }
    public one(int x){
        this();
        System.out.println("���췽������������");
    }
    public one(boolean b){
        this(1);
        System.out.println("���췽������������");
    }
    public static void main(String[] args) {
        new one(true);
    }
}
