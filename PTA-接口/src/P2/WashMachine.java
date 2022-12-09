package P2;

public class WashMachine implements ComputerWeight{
    double weight;

    public WashMachine() {
    }

    public WashMachine(double weight) {
        this.weight = weight;
    }

    @Override
    public double computerWeight() {
        return (3*weight);
    }
}
