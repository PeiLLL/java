package P9;

public class Computer implements ComputerWeight{
    double weight;

    public Computer(double weight) {
        this.weight = weight;
    }


    @Override
    public double computeWeight() {
        return 2*weight;
    }
}
