package P6;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ����ѧ������
        Student stu1 = new Student("1001","zs");
        Student stu2 = new Student("1002","ls");

        //2���鼯�Ͻӿڵ�ʵ����
        //�������򼯺�List�����򼯺������ѧ����
        List<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);

        //����ѧ������,��ʾѧ����Ϣ
        for(int i=0;i<students.size();i++) {
            //3�����������������ת��
            Student stu=students.get(i);
            System.out.println("no:"+stu.getNo()+"\t name:"+stu.getName());
        }
    }

}
