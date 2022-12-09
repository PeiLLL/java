package P4;

public class Factory {
    Animal getAnimalByType(int type,String name, int age, int ownAttribute){
        Dog d = new Dog(name,age,ownAttribute);
        Cat c = new Cat(name,age,ownAttribute);
        if(type == 1){
            return d;
        }
        else{
            return c;
        }
    }
}
