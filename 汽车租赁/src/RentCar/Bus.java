package RentCar;

//客车
public class Bus extends Vehicle {
    private int seatCount;//客车座位数量
    private double perRentbus;

    //客车构造方法
    //车名，品牌，数量，座位数，大型客车日租金，小型客车日租金
    public Bus(int vehicleNum, String car_Brand, String vehicled,int car_Num, int seatCount, double perRentbus) {
        this.car_Brand = car_Brand;
        this.car_Num = car_Num;
        this.seatCount = seatCount;
        this.perRentbus = perRentbus;
        this.vehicleld = vehicled;
        this.vehicleNum = vehicleNum;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public double getPerRentbus() {
        return perRentbus;
    }

    public void setPerRentbus(double perRentbus) {
        this.perRentbus = perRentbus;
    }

    //重写父类计算租金价格方法
    @Override
    public double calRent(int days) {
        double perRent = 0;
        double calRent = 0;
        if(seatCount == 16)
            perRent = 800;
        else if(seatCount == 34)
            perRent = 1500;

        if (days >= 3 && days < 7) {
            calRent= perRent * days * 0.9;
        } else if (days >= 7 && days < 30)
            calRent= perRent * days * 0.8;
        else if (days >= 30 && days < 150)
            calRent= perRent * days * 0.7;
        else if (days >= 150)
            calRent= perRent * days * 0.6;
        else if(days >= 0 && days < 3)
            calRent= perRent * days;

        return calRent;
    }
    //重写父类打印车辆信息方法
    @Override
    public void printCarInfo() {
        System.out.printf("客车"+vehicleNum+"：%s\t"+ "%d"+"座\t"+"%s\t"+"剩余"+"%d"+"辆\t\t"+ "%.2f"+"元/天\n",
                this.car_Brand,this.seatCount, this.vehicleld, this.car_Num, perRentbus);

    }
}
