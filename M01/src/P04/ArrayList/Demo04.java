package P04.ArrayList;

import java.util.ArrayList;

public class Demo04 {
    public static void main(String[] args) {
        Person[] p = new Person[4];
        p[0] = new Person("ljj",23);
        p[1] = new Person("asd",12);
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("jjl",23));
        list.add(p[1]);

        //±éÀú¼¯ºÏ

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+list.get(i).getAge());
        }
    }
}
