package P8;
import java.util.*;
class Factorial extends Thread
{ //声明线程类
    private int n;
    private long factorial;
    Factorial(int n){ this.n=n; }
    //返回阶乘
    public long getFactorial() { return factorial; }
    //线程体


    public Factorial()
    { //线程类必须实现接口定义的方法
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

        Thread th = new Thread(); //创建线程
        th.start(); //启动线程
        th.join(); //等待线程结束
        System.out.println(fac.getFactorial());//输出阶乘
    }
}