package RentCar;

import RentCar.Vehicle;
import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.ArrayList;

//轿车
public class Car extends Vehicle {
    private double perRentcar;//日租金

    //轿车构造方法
    //车名，品牌，数量，日租金
    public Car(int vehicleNum,String car_Brand, String car_Name, String vehicled, int carNum, double perRentcar) {
        this.car_Brand = car_Brand;
        this.car_Name = car_Name;
        this.car_Num = carNum;
        this.perRentcar = perRentcar;
        this.vehicleld = vehicled;
        this.vehicleNum = vehicleNum;
    }

    public Car() {
    }


    //重写父类计算租金价格方法
    public double calRent(int days) {
        double calRent = 20;
//        if("X6".equals(type))
        //           perRent = 800;
//        else if("550i".equals(type))
//            perRent = 600;
//        else if("林荫大道".equals(type))
//            perRent = 300;
//        else if("GL8".equals(type))
//            perRent = 600;
        if (days > 7 && days <= 30)
            calRent = (double) perRentcar * days * 0.9;
        else if (days > 30 && days <= 150)
            calRent = perRentcar * days * 0.8;
        else if (days > 150)
            calRent = perRentcar * days * 0.7;
        else if (days >= 0 && days <= 7)
            calRent = perRentcar * days;
        return calRent;
    }

    public static void display_Car(ArrayList listCar) {
        //System.out.printf("车型:    品牌     车名     剩余数量     日租金\t\n");
        System.out.println();
        //System.out.println(cars.size());
        for (int i = 0; i< listCar.size(); i++) {
//            listCar.get(i).printCarInfo();
            System.out.println(listCar);
        }
    }
    //重写父类打印车辆信息方法
    @Override
    public void printCarInfo() {
        System.out.printf("轿车"+vehicleNum+":  %s\t"+"%.2f"+"元/天\t"+"%s\t"+"剩余"+"%s"+"辆\t"+" %s\t\n", this.car_Brand, this.perRentcar, this.vehicleld,this.car_Num, this.car_Name);    }
}