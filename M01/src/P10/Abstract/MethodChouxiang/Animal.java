package P10.Abstract.MethodChouxiang;
/*
抽象方法，就是加上abstract关键字，然后去掉大括号，直接分号结束
抽象类；抽象方法所在的类，必须是抽象类才行，在class之前写上abstract即可

 如何使用抽象类和抽象方法
 1；不能直接创建new抽象类对象
 2；必须用一个子类来继承抽象父类
 3；子类必须覆盖重写抽象父类当中所有的抽象方法(去掉abstract并补上{};)
 4；创建子类对象并使用
 */
public abstract class Animal {
    //这是一个抽象方法，表示吃东西，但是具体不知道吃什么
    public abstract void eat();

    //这是普通的成员方法
    public void normalMethod(){

    }
}
