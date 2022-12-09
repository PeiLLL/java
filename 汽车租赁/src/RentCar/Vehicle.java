package RentCar;

public class Vehicle {
    String car_Name;//车名
    String car_Brand;//车的品牌
    int car_Num;//车的数量
    String vehicleld;//车牌号
    int vehicleNum;//车辆编号
    //根据租赁时间得到租金

    public Vehicle() {
    }

    public Vehicle(String car_Name, String car_Brand, int car_Num, String vehicleld, int vehicleNum) {
        this.car_Name = car_Name;
        this.car_Brand = car_Brand;
        this.car_Num = car_Num;
        this.vehicleld = vehicleld;
        this.vehicleNum = vehicleNum;
    }

    public double calRent(int days) {
        return 0;
    }


    //打印车辆的信息
    public void printCarInfo() {

    }


}
