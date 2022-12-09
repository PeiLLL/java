package P01;

public class Demo05Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(23);
        stu1.setName("林俊杰");
        System.out.println("姓名："+stu1.getName()+"年龄："+stu1.getAge());
        Student stu2 = new Student("周杰伦",30);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
    }

}
