import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*covnertStringToList函数代码*/
    public static List convertStringToList(String nextLine) {
        String str[] = nextLine.split(" ");
        List<String> l= new ArrayList<>();
        for(int i=0; i<str.length; i++){
            if(! "".equals(str[i]))
                l.add(str[i]);
        }
        return l;
    }

    /*remove函数代码*/
    public static void remove(List<String> list, String str){
        Iterator i = list.iterator();
        while(i.hasNext()){
            if(str.equals(i.next()))
                i.remove();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            List<String> list = convertStringToList(sc.nextLine());
            System.out.println(list);
            String word = sc.nextLine();
            remove(list,word);
            System.out.println(list);
        }
        sc.close();
    }


}
