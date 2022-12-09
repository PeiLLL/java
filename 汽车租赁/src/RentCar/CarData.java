package RentCar;
import java.util.ArrayList;
import java.util.List;

public class CarData {
//    protected static Car[] cars;//�γ�����
//    protected static Bus[] buses;//�ͳ�����
//    protected static Trunk[] trunks;//����
    //��ʼ������
static int lenghtc = 0;
static int lengthb = 0;
static int lengtht = 0;
    static {
        List<Vehicle> listCar = new ArrayList<Vehicle>();
        ArrayList<Vehicle> listBus = new ArrayList<Vehicle>();
        ArrayList<Vehicle> listTrunk = new ArrayList<Vehicle>();
        Vehicle[] cars = new Vehicle[lenghtc];
        Vehicle[] buses = new Bus[lengthb];
        Vehicle[] trunks = new Trunk[lengtht];

        listCar.add(new Car(1, "����", "X6", "��NY28588", 10, 800));
        listCar.add(new Car(2, "����", "550i", "��CNY3284", 10, 600));
        listCar.add(new Car(3, "���", "������", "��NT37465", 5, 300));
        listCar.add(new Car(4, "���", "GL8", "��NT96968", 8, 600));


        listBus.add(new Bus(1, "��", "��6566754", 10, 16, 800));
        listBus.add(new Bus(2, "��", "��8696997", 10, 16, 800));
        listBus.add(new Bus(3, "����", "��9696996", 8, 34, 1500));
        listBus.add(new Bus(4, "����", "��8696998", 8, 34, 1500));


    public static void display_Car(listCar) {
        //System.out.printf("����:    Ʒ��     ����     ʣ������     �����\t\n");
        System.out.println();
       //System.out.println(cars.size());
        for (int i = 0; i< listCar.size(); i++) {
            listCar.get(i).printCarInfo();
        }
    }

    static void display_Bus() {
        //System.out.printf("���ͣ�����  Ʒ����   ����   �����");
        System.out.println();
        for (int i = 0; i< buses.length; i++) {
            buses[i].printCarInfo();
        }
    }

    public static Car getCar(int carnumber) {
        for (int i = 0; i < cars.length; i++) {
            if (carnumber == cars[i].vehicleNum ) {
                //�ڽγ��������ҵ��ͻ���Ҫ������
                return cars[i];
            }
        }
        //û�ҵ����ؿ�
        return null;
    }

    public static Bus getBus(int busnumber) {
        for (int i = 0; i < buses.length; i++) {
            if (busnumber == buses[i].vehicleNum) {
                //�ڿͳ��������ҵ��ͻ���Ҫ�Ŀͳ�
                return buses[i];
            }
        }
        //û�ҵ����ؿ�
        return null;
    }


}
