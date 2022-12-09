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
        System.out.println("��è��������"+getName()+",������"+getName()+"��,����������"+mousingAbility+"��");
    }

    @Override
    public void speak() {
        System.out.println("����");

    }
}
