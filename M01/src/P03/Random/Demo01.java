package P03.Random;
/*
     Random��  ��ȡ�������
 */
import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(20);
        System.out.println("������ǣ�"+num);
    }
}
