package P7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();
        String name[] ;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine().split(" ");
        Product [] products = new Product[name.length]; //检查6件货物
        for(int i= 0;i<name.length;i++) {
            products[i] = new Product();
            if(i%2==0) {
                products[i].setIsDefect(false);
                products[i].setName(name[i]);
            }
            else {
                products[i].setIsDefect(true);
                products[i].setName(name[i]);
            }
        }
        for(int i= 0;i<products.length;i++) {
            try {
                machine.checkProduct(products[i]);
                System.out.println(products[i].getName()+"检查通过");
            }
            catch(DefectException e) {
                e.toShow();//【代码2】 //e调用toShow()方法
                System.out.println(products[i].getName()+"被禁止!");
            }
        }
    }
}


/* 将完整的Product类， DefectException类 和Machine类写在下面*/
