package P9;

public class Television implements ComputerWeight{
    double weight;

    public Television(double v) {
        this.weight = v;
    }

    @Override
    public double computeWeight() {
        return weight;
    }
}
