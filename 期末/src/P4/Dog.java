package P4;

public class Dog extends Animal{
    private int violence;

    public Dog(String name, int age, int violence) {
        super(name, age);
        this.violence = violence;
    }

    public int getViolence() {
        return violence;
    }

    public void setViolence(int violence) {
        this.violence = violence;
    }

    @Override
    public void info() {
        System.out.println("�ù���������"+getName()+",������"+getAge()+"��,"+"���ͳ̶���"+violence+"��");
    }

    @Override
    public void speak() {
        System.out.println("����");
    }
}
