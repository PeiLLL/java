package P06.Static;

import java.util.Objects;

public class Demo01Field {
    public static void main(String[] args) {
        Student one = new Student("����",19);
        Student two = new Student("����",20);
        one.room = "101";
        System.out.println("������"+one.getName()+
                "ѧ�ţ�"+one.getId()+"���䣺"+one.getAge()+"���䣻"+one.room);
        System.out.println("������"+two.getName()+
                "ѧ�ţ�"+two.getId()+"���䣺"+two.getAge()+"���䣺"+two.room);
    }
}
