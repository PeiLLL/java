package P08.Math;

/*
public static double abs(double,num);��ȡ����ֵ
public static double ceil(double,num);����ȡ��
public static double floor(double num);����ȡ��
publid static long roubd(double num);��������
 */
public class Demo01 {
    public static void main(String[] args) {
        //ȡ����ֵ
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.3));
        System.out.println("----------------");

        //����ȡ��
        System.out.println(Math.ceil(3.9));
        System.out.println("----------------");
        //����ȡ��
        System.out.println(Math.floor(3.9));
        System.out.println("------------------");
        //��������
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));
    }
}
