package RentCar;

public class Vehicle {
    String car_Name;//����
    String car_Brand;//����Ʒ��
    int car_Num;//��������
    String vehicleld;//���ƺ�
    int vehicleNum;//�������
    //��������ʱ��õ����

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


    //��ӡ��������Ϣ
    public void printCarInfo() {

    }


}
