package P01;

public class Person {
    String name;
    private int age;

    public void setAge(int num){
        if(num>0 || num<100){
        age = num;}
        else
            System.out.println("error");
    }
    public int getAge(){
        return age;
    }
    public void show() {
        System.out.println("ÎÒ½Ğ£º"+name+",ÄêÁä£º"+age);
    }
}
