package P09.Extends.Extends;
/*
                  �� ��
���常��ĸ�ʽ��
public class ��������{
    ......
};

���ඨ���ʽ��
public class �������� extends ��������{
    ......
}

�ڸ�����ļ̳й�ϵ�У������Ա�����������򴴽��������ʱ�����������ַ�ʽ

ֱ��ͨ�����������ʳ�Ա������
    �Ⱥ������˭��������ʹ��˭��û���������ҡ�
���ͨ����Ա�������ʳ�Ա������
    ���÷�������˭��������ʹ��˭��û����������
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
        s.methodzi();   //������ķ���
        s.methodfu();   //������ķ���
    }
}
