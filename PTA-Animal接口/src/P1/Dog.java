package P1;

public class Dog extends Animal implements IAbility{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void showInfo() {
        System.out.println("我是一只狗,我的名字是"+getName()+",今年"+getAge()+"岁");

    }

    @Override
    public void cry() {
        System.out.println("旺旺");
        System.out.println(getName());
        System.out.println(getAge());
    }
}
