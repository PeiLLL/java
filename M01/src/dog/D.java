package dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class D {
    public static void main(String[] args) {
        HashSet<Dog> hashSet = new HashSet<>();
        hashSet.add(new Dog("aa","11"));
        hashSet.add(new Dog("bb","22"));
        hashSet.add(new Dog("cc","33"));
            System.out.println(hashSet);
    }
}
