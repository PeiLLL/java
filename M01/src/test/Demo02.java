package test;

import java.util.ArrayList;

//题目：自定义4个学生对象，添加到集合，并遍历
public class Demo02 {
    public static void main(String[] args) {
        Student st1 = new Student("小一",20);
        Student st2 = new Student("小二",21);
        Student st3 = new Student("小三",19);
        Student st4 = new Student("小四",18);
        ArrayList<Student> list = new ArrayList<>();

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名："+stu.getName()+"  年龄："+stu.getAge());
        }
    }
}
