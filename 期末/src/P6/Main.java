package P6;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 创建学生对象
        Student stu1 = new Student("1001","zs");
        Student stu2 = new Student("1002","ls");

        //2考查集合接口的实例化
        //创建有序集合List，并向集合中添加学生，
        List<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);

        //计算学生人数,显示学生信息
        for(int i=0;i<students.size();i++) {
            //3考查遍历方法和向下转型
            Student stu=students.get(i);
            System.out.println("no:"+stu.getNo()+"\t name:"+stu.getName());
        }
    }

}
