package P1;

public class Gymnastics implements ComputerAverage{
    @Override
    public double average(double[] x) {
        double re = 0;
        double temp = 0;
        for (int i = 0; i < x.length-1; i++) {
            for (int j = 0; j < x.length-1-i; j++) {
                if(x[j] > x[j+1]) {
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        for (int i = 1; i < x.length-1; i++) {
            re += x[i];
        }
        return (re/(x.length-2));

    }
}


