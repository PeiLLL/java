package P04.ArrayList;

/**
 * demo01����
 *
 * @author llq
 * @date 2022/11/28
 */
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("�����Ȱ�", 18);
        Person two = new Person("zhou", 20);
        Person three = new Person("jj", 19);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        for (Person person : array) {
            System.out.println(person);
        }
    }
}


