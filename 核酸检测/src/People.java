import java.security.PrivateKey;

public class People {
    private String name;
    private String age;
    private String sex;

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public People(String name, String age, String sex, String id) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void backHome(){

    }
}
