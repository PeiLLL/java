package P11.Interface;
/*
注意：不能通过接口实现类的对象来调用接口当中的静态方法

正确方法；通过接口名称，直接调用其中的静态方法
格式；
接口名称.静态方法名称（参数）;
 */
public class Demo03Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        MyinterfaceAbstractImpl impl = new MyinterfaceAbstractImpl();
        //通过接口名称，直接调用其中的静态方法
        MyInterfaceStatic.methodStatic();

    }
}
