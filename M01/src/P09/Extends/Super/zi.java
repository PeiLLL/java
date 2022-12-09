package P09.Extends.Super;
/*
super关键字的用法有三种：
1.在子类的成员方法中，访问父类的成员变量
2.在子类的成员方法中，访问父类的成员方法
3.在在类的构造方法中，访问父类的构造方法
 */
public class zi extends fu{
    int num = 20;

    public void methodzi(){
        System.out.println(super.num);//父类中的num = 10
    }

    public void method(){
        super.method();//子类中访问父类方法
        System.out.println("子类方法");
    }

    public zi(){
        super();//访问父类构造方法
    }
}
