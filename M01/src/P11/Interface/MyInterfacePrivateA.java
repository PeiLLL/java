package P11.Interface;
/*
问题；
需要抽取一个公有方法，用来解决两个默认方法之间重复代码的问题
但是这个公共方法不应该让实现类使用，应该私有化的

解决方法；
1.不同私有方法，解决多个默认方法之间重复代码问题
格式；
private 返回值类型 方法名称(参数列表){
    方法体
}
2，静态私有方法，解决多个静态方法之间重复代码问题
格式；
private static 返回值类型 方法名称(参数列表){
    方法体
}

*/
public interface MyInterfacePrivateA {

    public default void methodDefaultA(){
        System.out.println("默认方法1");
        methodcommon();
    }

    public default void methodDefaultB(){
        System.out.println("默认方法2");
        methodcommon();
    }
    private void methodcommon(){
        System.out.println("a");
        System.out.println("b");
    }
}
