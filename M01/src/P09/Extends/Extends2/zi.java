package P09.Extends.Extends2;

public class zi extends fu{
    int num = 30;

    public void method() {
        int num = 40;
        System.out.println(num);//30�ֲ�����
        System.out.println(this.num);//�����Ա����
        System.out.println(super.num);//�����Ա����
    }
}

