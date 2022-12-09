package P06.Static;
/*
一旦使用static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类

如果没有static关键字，娜美必须首先创建对象，然后通过对象使用
如果有static关键字，那么不需要创建对象，直接就能通过类名称来使用

无论是成员变量还是成员方法，如果有了static，都用类名称进行调用
静态变量；类名称.静态变量
静态方法；类名称.静态方法()
注意：
1.静态不能直接访问非静态(因为内存中现有的静态内容，后有的非静态内容)
2.静态方法中不能用this(this代表当前对象，用过谁调用的方法，谁就是当前对象)
 */
public class Demo02method {
    public static void main(String[] args) {
        Method obj = new Method();//首先创造对象，才能使用没有static关键字的方法
        obj.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用；
        Method.methodStatic();

        FF();//在本类中调用，类名称省略，完整格式为Demo02method.FF();
    }
    public static void FF(){
        System.out.println("静态方法");
    }
}
