package P11.Interface;
/*
��java 8 ��ʼ�ӿ���������Ĭ�Ϸ���
��ʽ��
public default ����ֵ���� ��������(�����б�){
    ������
}

 */
public interface MyinterfaceDefault {
        //���󷽷�
        public abstract void method();

        //����ӵĳ��󷽷�
       // public abstract void method2();

        //Ĭ�Ϸ���
        public default void methodDefault(){
                System.out.println("����ӵ�Ĭ�Ϸ���");
        }
}
