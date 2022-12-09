package P01;
/*
一个标准的类通常要有四部分组成：
1；为所有的成员变量都要有private修饰
2；为所有的成员编写一堆getter/setter方法
3；编写一个无参数的构造方法
4；编写一个全参数的构造方法
 */
public class Student {
    private String name;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private int age;

}
