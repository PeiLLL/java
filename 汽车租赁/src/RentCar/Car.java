package RentCar;

import RentCar.Vehicle;
import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.ArrayList;

//�γ�
public class Car extends Vehicle {
    private double perRentcar;//�����

    //�γ����췽��
    //������Ʒ�ƣ������������
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


    //��д����������۸񷽷�
    public double calRent(int days) {
        double calRent = 20;
//        if("X6".equals(type))
        //           perRent = 800;
//        else if("550i".equals(type))
//            perRent = 600;
//        else if("������".equals(type))
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
        //System.out.printf("����:    Ʒ��     ����     ʣ������     �����\t\n");
        System.out.println();
        //System.out.println(cars.size());
        for (int i = 0; i< listCar.size(); i++) {
//            listCar.get(i).printCarInfo();
            System.out.println(listCar);
        }
    }
    //��д�����ӡ������Ϣ����
    @Override
    public void printCarInfo() {
        System.out.printf("�γ�"+vehicleNum+":  %s\t"+"%.2f"+"Ԫ/��\t"+"%s\t"+"ʣ��"+"%s"+"��\t"+" %s\t\n", this.car_Brand, this.perRentcar, this.vehicleld,this.car_Num, this.car_Name);    }
}