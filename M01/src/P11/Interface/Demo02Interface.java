package P11.Interface;

public class Demo02Interface {
    public static void main(String[] args) {

        //创建实现类对象
        MyInterfaceDfaultA a = new MyInterfaceDfaultA();
        a.method();//调用抽象方法
        a.methodDefault();//实现默认方法，如果实现类当中没有，会向上找接口

        System.out.println("================");
        MyInterfaceDfaultB b = new MyInterfaceDfaultB();
        b.method();
        b.methodDefault();
    }
}
