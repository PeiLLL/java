package P06.Static;

public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idconter = 0;//ѧ�ż�������ÿ��newһ���¶����ʱ��++


    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
        this.id = ++idconter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id =++idconter;
    }

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
        this.age = age;
    }
}
