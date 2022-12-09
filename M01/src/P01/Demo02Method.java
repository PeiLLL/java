package P01;

public class Demo02Method {
    public static void main(String[] args) {
        int [] array = {5,15,25,30,35,200};
        int max = getmax(array);
        System.out.println(max);
    }

    public static int getmax(int[]array) {
        int max = array[0];
        for(int i = 0; i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }

}
