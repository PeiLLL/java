package P6;

import java.util.Scanner;

public class Test_Exception{
    void test() {
        int n = 0,m = 0,t = 1000;
        int[] a=new int[4];
        int[] b=null;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        try {
            m = Integer.parseInt(str);
            t=t/m;
            a[m]=m;
            b[0]=m;
        }
        //catch������Ҫ�����Լ���д
        catch(NumberFormatException e){
            System.out.println("���ݸ�ʽ�쳣");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Խ���쳣");
        }
        catch(ArithmeticException e ){
            System.out.println("���������쳣");
        }
        catch(Exception e) {
            System.out.println("Exception:"+e.getMessage());
        }  //��catch����Exception,��catch����
    }
}

