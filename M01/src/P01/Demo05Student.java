package P01;

public class Demo05Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(23);
        stu1.setName("�ֿ���");
        System.out.println("������"+stu1.getName()+"���䣺"+stu1.getAge());
        Student stu2 = new Student("�ܽ���",30);
        System.out.println("������"+stu2.getName()+"���䣺"+stu2.getAge());
    }

}
