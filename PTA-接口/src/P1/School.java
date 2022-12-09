package P1;

public class School implements ComputerAverage{
    @Override
    public double average(double[] x) {
        double re = 0;
        for (int i = 0; i < x.length; i++) {
            re += x[i];
        }
        return re/(x.length);
    }
}
