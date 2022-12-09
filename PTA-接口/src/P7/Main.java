package P7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();
        String name[] ;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine().split(" ");
        Product [] products = new Product[name.length]; //���6������
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
                System.out.println(products[i].getName()+"���ͨ��");
            }
            catch(DefectException e) {
                e.toShow();//������2�� //e����toShow()����
                System.out.println(products[i].getName()+"����ֹ!");
            }
        }
    }
}


/* ��������Product�࣬ DefectException�� ��Machine��д������*/
