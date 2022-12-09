package P11.Interface;

public interface MyInterfacePrivateB {
    public static void methodStaticA(){
        System.out.println("静态方法1");
        methodStaticCommon();
    }

    public static void methodStaticB(){
        System.out.println("静态方法2");
        methodStaticCommon();
    }
    private static void methodStaticCommon(){
        System.out.println("a");
        System.out.println("b");
    }
}
