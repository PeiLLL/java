package P2;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 6)
            this.age = 7;
        else
            this.age = age;
    }

    public Student() {
        age = 7;
        name = "����";
        System.out.println("�޲ι��췽��");
    }

    public void display(){
        System.out.println("name:"+name+",age:"+age);
    }
}
