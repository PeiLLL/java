package P09.Extends.This;

public class zi extends fu{
    int num = 10;
    public void shownumber(){
        int num = 20;
        System.out.println(num);//20
        System.out.println(this.num);//10   调用本类成员变量
        System.out.println(super.num);//30
    }

    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        this.method1();//method1    调用本类成员方法
    }

    public zi(){
        this(132);//本类的无参构造，调用本类的有参构造
        // (必须是构造方法的第一个语句，且是唯一一个)
        //super和this不能同时使用，因为都必须要在第一句
    }
    public zi(int n){

    }
    public zi(int n, int m){

    }
}
