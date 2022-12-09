package P03.Random;
/*
     Random类  获取随机数字
 */
import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(20);
        System.out.println("随机数是："+num);
    }
}
