package P09.Extends.Extends2;

public class zi extends fu{
    int num = 30;

    public void method() {
        int num = 40;
        System.out.println(num);//30局部变量
        System.out.println(this.num);//本类成员变量
        System.out.println(super.num);//父类成员变量
    }
}

