package test;

import java.util.ArrayList;

//��Ŀ���Զ���4��ѧ��������ӵ����ϣ�������
public class Demo02 {
    public static void main(String[] args) {
        Student st1 = new Student("Сһ",20);
        Student st2 = new Student("С��",21);
        Student st3 = new Student("С��",19);
        Student st4 = new Student("С��",18);
        ArrayList<Student> list = new ArrayList<>();

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("������"+stu.getName()+"  ���䣺"+stu.getAge());
        }
    }
}
