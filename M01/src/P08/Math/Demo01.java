package P08.Math;

/*
public static double abs(double,num);获取绝对值
public static double ceil(double,num);向上取整
public static double floor(double num);向下取整
publid static long roubd(double num);四舍五入
 */
public class Demo01 {
    public static void main(String[] args) {
        //取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.3));
        System.out.println("----------------");

        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println("----------------");
        //向下取整
        System.out.println(Math.floor(3.9));
        System.out.println("------------------");
        //四舍五入
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));
    }
}
