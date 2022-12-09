package P06.Static;

import java.util.Objects;

public class Demo01Field {
    public static void main(String[] args) {
        Student one = new Student("郭靖",19);
        Student two = new Student("黄蓉",20);
        one.room = "101";
        System.out.println("姓名："+one.getName()+
                "学号："+one.getId()+"年龄："+one.getAge()+"房间；"+one.room);
        System.out.println("姓名："+two.getName()+
                "学号："+two.getId()+"年龄："+two.getAge()+"房间："+two.room);
    }
}
