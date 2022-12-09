package P2;

public class Computer implements ComputerWeight{
    double weight;

    public Computer() {
    }

    public Computer(double weight) {
        this.weight = weight;
    }

    @Override
    public double computerWeight() {
        return (2*weight);
    }
}
