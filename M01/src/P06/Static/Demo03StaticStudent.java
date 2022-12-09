package P06.Static;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room = "101A";
        Student one = new Student("abc",20);
        Student two = new Student("def",21);
        System.out.println("nameone:" +one.getName()+"ageone:"+one.getAge()+"roomone:"+one.room);
        System.out.println("nameywo:" +two.getName()+"agetwo:"+two.getAge()+"roomtwo:"+two.room);
    }
}
