package P4;

public class Cat extends Animal{
    private int mousingAbility;

    public Cat(String name, int age, int mousingAbility) {
        super(name, age);
        this.mousingAbility = mousingAbility;

    }
    public int getMousingAbility() {
        return mousingAbility;
    }

    public void setMousingAbility(int mousingAbility) {
        this.mousingAbility = mousingAbility;
    }

    @Override
    public void info() {
        System.out.println("该猫的名字是"+getName()+",年龄是"+getName()+"岁,捕鼠能力是"+mousingAbility+"分");
    }

    @Override
    public void speak() {
        System.out.println("喵喵");

    }
}
