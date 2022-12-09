package RentCar;
import RentCar.Vehicle;
public class Trunk extends Vehicle{
    private double weight;//‘ÿ÷ÿ¡ø
    private double perRent;
    public Trunk() {
    }

    public Trunk(int vehicleNum, String car_Brand, String car_Name, double perRent, int car_Num, String vehicleld, double weight) {
        super(car_Name, car_Brand, car_Num, vehicleld, vehicleNum);
        this.weight = weight;
        this.perRent = perRent;
    }

    @Override
    public double calRent(int days) {
        return 0;
    }

    @Override
    public void printCarInfo() {

    }
}
