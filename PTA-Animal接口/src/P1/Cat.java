package P1;

public class Cat extends Animal implements IAbility{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void showInfo() {
        System.out.println("����һֻè,�ҵ�������"+getName()+",����"+getAge()+"��");
    }

    @Override
    public void cry() {
        System.out.println("����");
    }
}
