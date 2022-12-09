package dog;

public class Dog {
    private String name;
    private String tpye;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTpye() {
        return tpye;
    }

    public void setTpye(String tpye) {
        this.tpye = tpye;
    }

    public Dog(String name, String tpye) {
        this.name = name;
        this.tpye = tpye;
    }

    public Dog() {
    }
}
