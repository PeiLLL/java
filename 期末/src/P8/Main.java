package P8;
import java.util.*;
class Factorial extends Thread
{ //�����߳���
    private int n;
    private long factorial;
    Factorial(int n){ this.n=n; }
    //���ؽ׳�
    public long getFactorial() { return factorial; }
    //�߳���


    public Factorial()
    { //�߳������ʵ�ֽӿڶ���ķ���
        factorial=1;
        for (int i = 2; i <= n; i++){
            factorial=factorial*i;
        }
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Factorial fac=new Factorial(sc.nextInt());

        Thread th = new Thread(); //�����߳�
        th.start(); //�����߳�
        th.join(); //�ȴ��߳̽���
        System.out.println(fac.getFactorial());//����׳�
    }
}