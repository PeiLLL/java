package P9;

public class WashMachine implements ComputerWeight{
    double weight;

    public WashMachine(double v) {
        this.weight = v;
    }

    @Override
    public double computeWeight() {
        return 3*weight;
    }
}
