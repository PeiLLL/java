package P08.Math;
//计算再-10.8到5.9之间，绝对值大于6或绝对值小于2.1的整数有多少个
public class Demo02 {
    public static void main(String[] args) {
        double count = 0,min = -10.8;
        double max = 5.9;
        for(int i = (int)min; i<max; i++){
            int abs = Math.abs(i);
            if(abs > 6 || abs < 2.1){
                count++;
            }
        }
        System.out.println("总共有："+(int)count);
    }
}
