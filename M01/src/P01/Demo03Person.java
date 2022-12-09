package P01;

public class Demo03Person {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.show();

        person1.name = "аж©║╫э";
        //person1.age = -1;
        person1.setAge(2);
        person1.show();
    }
}
