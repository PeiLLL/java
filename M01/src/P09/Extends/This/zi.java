package P09.Extends.This;

public class zi extends fu{
    int num = 10;
    public void shownumber(){
        int num = 20;
        System.out.println(num);//20
        System.out.println(this.num);//10   ���ñ����Ա����
        System.out.println(super.num);//30
    }

    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        this.method1();//method1    ���ñ����Ա����
    }

    public zi(){
        this(132);//������޲ι��죬���ñ�����вι���
        // (�����ǹ��췽���ĵ�һ����䣬����Ψһһ��)
        //super��this����ͬʱʹ�ã���Ϊ������Ҫ�ڵ�һ��
    }
    public zi(int n){

    }
    public zi(int n, int m){

    }
}
