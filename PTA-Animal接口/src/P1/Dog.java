package P1;

public class Dog extends Animal implements IAbility{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void showInfo() {
        System.out.println("����һֻ��,�ҵ�������"+getName()+",����"+getAge()+"��");

    }

    @Override
    public void cry() {
        System.out.println("����");
        System.out.println(getName());
        System.out.println(getAge());
    }
}
