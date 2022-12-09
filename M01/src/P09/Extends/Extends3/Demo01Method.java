package P09.Extends.Extends3;
/*
重写（Override）
概念：
    在继承关系中，方法的名称一样，参数泪飙也一样

重写（Override）：方法的名称一样，参数列表也一样，
重载（Overlood）：方法的名称一样，参数列表不一样

方法的覆盖重写的特点：创建的是子类对象，则优先用子类方法
 */
public class Demo01Method {
    public static void main(String[] args) {
        zi z = new zi();
        z.methodzi();   //子类方法
        z.methodfu();   //父类方法

        z.method();    //子类重名方法
    }
}
