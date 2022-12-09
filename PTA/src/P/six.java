package P;

import java.util.Scanner;

public class six {
    public static <bool> void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        int temp;
        for(int j = 0; j<N; j++){
            for(int k = j+1; k<N; k++){
                if(a[j]>a[k]){
                    temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                }
            }
        }
        int find = in.nextInt();
        boolean count = false;
        for(int i = 0; i<N; i++){
            if(find == a[i]){
                System.out.println(i+1);
                count = true;
            }
        }
        if(count == false){
            System.out.println("-1");
        }
    }
}
