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
        System.out.println("该狗的名字是"+getName()+",年龄是"+getAge()+"岁,"+"凶猛程度是"+violence+"度");
    }

    @Override
    public void speak() {
        System.out.println("汪汪");
    }
}
