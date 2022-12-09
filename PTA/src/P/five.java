package P;
import java.util.ArrayList;
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> ziFuChuan = new ArrayList<>();
        String s1 = in.nextLine();
        char[] ch = s1.toCharArray();

        String[] s2 = new String[s1.length()];
        int flag = 0;

        for(int i = 0; i<ch.length; i++) {
            if(ch[i] >= '0' && ch[i] <='9') {
                ch[i] = '0';
            }
            s2[i] = String.valueOf(ch[i]);
            if(s2[i].charAt(0) != '0') {
                ziFuChuan.add(s2[i]);
                flag ++;
            }
        }
        for(int i = flag-1; i >= 0 ; i--) {
            System.out.printf(ziFuChuan.get(i));
        }

    }
}