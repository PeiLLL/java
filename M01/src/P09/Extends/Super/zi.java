package P09.Extends.Super;
/*
super�ؼ��ֵ��÷������֣�
1.������ĳ�Ա�����У����ʸ���ĳ�Ա����
2.������ĳ�Ա�����У����ʸ���ĳ�Ա����
3.������Ĺ��췽���У����ʸ���Ĺ��췽��
 */
public class zi extends fu{
    int num = 20;

    public void methodzi(){
        System.out.println(super.num);//�����е�num = 10
    }

    public void method(){
        super.method();//�����з��ʸ��෽��
        System.out.println("���෽��");
    }

    public zi(){
        super();//���ʸ��๹�췽��
    }
}
