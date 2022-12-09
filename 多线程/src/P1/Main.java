package P1;

public class Main {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        int a = one(sum);
        int b = two(sum=0);
        int c = three(sum=0);
        int d = four(sum=0);
        System.out.println(a+b+c+d);

    }

    public static int one(int sum) throws Exception{
        for(int i = 1; i<= 25; i++){
            sum += i;
        }
        return sum;
    }
    public static int two(int sum) throws Exception{
        for(int i = 26; i<= 50; i++){
            sum += i;
        }
        return sum;
    }
    public static int three(int sum) throws Exception{
        for(int i = 51; i<= 75; i++){
            sum += i;
        }
        return sum;
    }
    public static int four(int sum) throws Exception{
        for(int i = 76; i<= 100; i++){
            sum += i;
        }
        return sum;
    }
}
