package P09.Extends.Extends5;
/*
继承关系中，父子类构造方法的访问特点：
1.子类构造方法中有一个默认隐含的super()调用，调用父类构造方法；
2.子类构造可以通过super关键字来调用父类重载构造
3.super的父类构造调用，必须是子类构造方法的第一个语句

总结；子类必须调用父类构造方法，不写则自动生成super()；
        写了则用自己的super();调用，super()只能有一个，并且必须写在第一句
 */
public class Demo {
    public static void main(String[] args) {
        zi z = new zi();

    }
}
