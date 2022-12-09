package P06.Static;

public class Method {
    int num= 10;//成员变量
    static int numstatic = 100;//静态变量
    public void method(){
        System.out.println("这是普通成员方法");

        System.out.println(num);//成员方法可以访问静态变量

        System.out.println(numstatic);//成员方法可以访问静态变量
    }
    public static void methodStatic(){
        System.out.println("这是一个静态方法");

        //System.out.println(num);//静态方法不可以访问静态变量

        System.out.println(numstatic);//静态方法可以访问静态变量
    }
}
