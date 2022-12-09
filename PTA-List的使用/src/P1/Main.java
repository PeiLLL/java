package P1;

import javax.swing.text.html.HTMLDocument;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name1 = in.next();
            int age1 = in.nextInt();
            People p = new People(name1,age1);
            list.add(p);
        }

        display(list);


        String str = in.next();
        for (int i = 0; i < list.size(); i++) {
            if(((People)list.get(i)).getName().equals(str)){
                System.out.println(list.get(i).toString());
                break;
            }
            if(i == list.size()-1)
                System.out.println("此人不存在");
        }
    }
    public static void display(List list){
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }
}
