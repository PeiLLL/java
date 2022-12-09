package P1;

public class Cat extends Animal implements IAbility{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void showInfo() {
        System.out.println("我是一只猫,我的名字是"+getName()+",今年"+getAge()+"岁");
    }

    @Override
    public void cry() {
        System.out.println("喵喵");
    }
}
