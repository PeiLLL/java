package P11.Interface;
/*
���⣻
��Ҫ��ȡһ�����з����������������Ĭ�Ϸ���֮���ظ����������
�����������������Ӧ����ʵ����ʹ�ã�Ӧ��˽�л���

���������
1.��ͬ˽�з�����������Ĭ�Ϸ���֮���ظ���������
��ʽ��
private ����ֵ���� ��������(�����б�){
    ������
}
2����̬˽�з�������������̬����֮���ظ���������
��ʽ��
private static ����ֵ���� ��������(�����б�){
    ������
}

*/
public interface MyInterfacePrivateA {

    public default void methodDefaultA(){
        System.out.println("Ĭ�Ϸ���1");
        methodcommon();
    }

    public default void methodDefaultB(){
        System.out.println("Ĭ�Ϸ���2");
        methodcommon();
    }
    private void methodcommon(){
        System.out.println("a");
        System.out.println("b");
    }
}
