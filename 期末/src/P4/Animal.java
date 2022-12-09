package P4;

abstract class Animal{
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    /**
     * 信息
     */
    public abstract void info();

    /**
     * 说话
     */
    public abstract void speak();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
