package P2;
import java.util.Scanner;
public class one {
    public one(){
        System.out.println("构造方法一被调用了");
    }
    public one(int x){
        this();
        System.out.println("构造方法二被调用了");
    }
    public one(boolean b){
        this(1);
        System.out.println("构造方法三被调用了");
    }
    public static void main(String[] args) {
        new one(true);
    }
}
