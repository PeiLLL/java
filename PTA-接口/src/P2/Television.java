package P2;

public class Television implements ComputerWeight{
    double weight;

    public Television() {
    }

    public Television(double weight) {
        this.weight = weight;
    }

    @Override
    public double computerWeight(){
        return weight;
    }
}
