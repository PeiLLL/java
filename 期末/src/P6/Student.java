package P6;

public class Student {
    private String no;
    private String name;

    public Student(String no, String name) {
        super();
        this.no = no;
        this.name = name;
    }
    public Student() {
        super();
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [no=" + no + ", name=" + name + "]";
    }

}
