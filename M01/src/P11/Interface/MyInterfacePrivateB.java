package P11.Interface;

public interface MyInterfacePrivateB {
    public static void methodStaticA(){
        System.out.println("��̬����1");
        methodStaticCommon();
    }

    public static void methodStaticB(){
        System.out.println("��̬����2");
        methodStaticCommon();
    }
    private static void methodStaticCommon(){
        System.out.println("a");
        System.out.println("b");
    }
}
