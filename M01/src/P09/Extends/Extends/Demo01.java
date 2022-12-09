package P09.Extends.Extends;
/*
                  继 承
定义父类的格式：
public class 父类名称{
    ......
};

子类定义格式：
public class 子类名称 extends 父类名称{
    ......
}

在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式

直接通过子类对象访问成员变量：
    等号左边是谁，就优先使用谁，没有则想上找。
间接通过成员方法访问成员变量：
    看该方法属于谁，就优先使用谁，没有则向上找
 */
public class Demo01 {
    public static void main(String[] args) {
        son s = new son();
        System.out.println(s.nums1);
        System.out.println(s.numfu);

        son2 s2 = new son2();
        System.out.println(s2.num);

        Father f = new Father();
        System.out.println(f.numfu);
        s.methodzi();   //子类里的方法
        s.methodfu();   //父类里的方法
    }
}
