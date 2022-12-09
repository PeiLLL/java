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
        //catch部分需要你们自己填写
        catch(NumberFormatException e){
            System.out.println("数据格式异常");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("越界异常");
        }
        catch(ArithmeticException e ){
            System.out.println("算数运算异常");
        }
        catch(Exception e) {
            System.out.println("Exception:"+e.getMessage());
        }  //先catch子类Exception,后catch父类
    }
}

