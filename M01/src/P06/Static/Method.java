package P06.Static;

public class Method {
    int num= 10;//��Ա����
    static int numstatic = 100;//��̬����
    public void method(){
        System.out.println("������ͨ��Ա����");

        System.out.println(num);//��Ա�������Է��ʾ�̬����

        System.out.println(numstatic);//��Ա�������Է��ʾ�̬����
    }
    public static void methodStatic(){
        System.out.println("����һ����̬����");

        //System.out.println(num);//��̬���������Է��ʾ�̬����

        System.out.println(numstatic);//��̬�������Է��ʾ�̬����
    }
}
