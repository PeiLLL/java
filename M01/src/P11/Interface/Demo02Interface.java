package P11.Interface;

public class Demo02Interface {
    public static void main(String[] args) {

        //����ʵ�������
        MyInterfaceDfaultA a = new MyInterfaceDfaultA();
        a.method();//���ó��󷽷�
        a.methodDefault();//ʵ��Ĭ�Ϸ��������ʵ���൱��û�У��������ҽӿ�

        System.out.println("================");
        MyInterfaceDfaultB b = new MyInterfaceDfaultB();
        b.method();
        b.methodDefault();
    }
}
