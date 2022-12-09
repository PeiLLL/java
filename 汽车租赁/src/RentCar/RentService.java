package RentCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//����ϵͳ
public class RentService {

    public static void main(String[] args) {
        List<Vehicle> listCar = new ArrayList<Vehicle>();
        ArrayList<Vehicle> listBus = new ArrayList<Vehicle>();
        ArrayList<Vehicle> listTrunk = new ArrayList<Vehicle>();

        listCar.add(new Car(1, "����", "X6", "��NY28588", 10, 800));
        listCar.add(new Car(2, "����", "550i", "��CNY3284", 10, 600));
        listCar.add(new Car(3, "���", "������", "��NT37465", 5, 300));
        listCar.add(new Car(4, "���", "GL8", "��NT96968", 8, 600));


        listBus.add(new Bus(1, "��", "��6566754", 10, 16, 800));
        listBus.add(new Bus(2, "��", "��8696997", 10, 16, 800));
        listBus.add(new Bus(3, "����", "��9696996", 8, 34, 1500));
        listBus.add(new Bus(4, "����", "��8696998", 8, 34, 1500));
        //�½�һ��������ϵͳ
        RentService service = new RentService();
        Scanner scanner = new Scanner(System.in);
        service.menu();
        int chooseNum = scanner.nextInt();
        while (true) {

            if (chooseNum == 1) {
                service.rentCar();
                break;
            } else if (chooseNum == 2) {
                service.sendBack();
                break;
            } else if (chooseNum == 0) {
                System.out.println("�����˳���ϵͳ");
                System.exit(0);
            } else {
                System.out.println("�����������������");
                continue;
            }
        }
    }

    void menu() {
        System.out.println("====��ӭ����1" + "������������====");
        System.out.println("====��ѡ������Ҫ�ķ���====");
        System.out.println("1.���޳��� 2.�˻����� 0.�˳���ϵͳ");
    }

    //���޳�����������
    void rentCar() {
        System.out.println("====��ѡ������Ҫ����������====");
        System.out.println("1.�γ�  2.�ͳ�");
        Scanner scanner = new Scanner(System.in);
        int carType = scanner.nextInt();
        if (carType == 1) {
            while (true) {
                System.out.println("������Ŀǰӵ�еĽγ���");
                CarData.display_Car();
                System.out.println("��������ѡ��Ҫ����������");
                int carnumber = scanner.nextInt();
                Car rentalCar = CarData.getCar(carnumber);
                if (rentalCar != null && rentalCar.car_Num > 0) {
                    //����������������������������㡣�������������������������
                    System.out.println("��ѡ����Ҫ���ýγ���ʱ��(��)");
                    int days = scanner.nextInt();
                    double totalRent = rentalCar.calRent(days);
                    System.out.println("�������⳵�������Ϊ " + totalRent + "Ԫ");
                    //������������������1
                    rentalCar.car_Num--;
                    break;
                } else {
                    //���������ڻ�����������
                    System.out.println("�Բ�����ѡ��ĳ��������ڻ��������㣬����������");
                    continue;
                }
            }
        } else if (carType == 2) {
            while (true) {
                System.out.println("������Ŀǰӵ�еĿͳ���");
                CarData.display_Bus();
                System.out.println("��������ѡ��Ҫ��Ŀͳ����");
                int busnumber = scanner.nextInt();
                Bus rentalCar = CarData.getBus(busnumber);
                if (rentalCar != null && rentalCar.car_Num > 0) {
                    //����������������������������㡣�������������������������
                    System.out.println("��ѡ����Ҫ���ÿͳ���ʱ��(��)");
                    int days = scanner.nextInt();
                    double totalRent = rentalCar.calRent(days);
                    System.out.println("�������⳵�������Ϊ " + totalRent + "Ԫ");
                    //������������������1
                    rentalCar.car_Num--;
                    break;
                } else {
                    //���������ڻ�����������
                    System.out.println("�Բ�����ѡ��ĳ��������ڻ��������㣬����������");
                    continue;
                }
            }
        }
        scanner.close();
    }

    void sendBack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("���������˻��ĳ�������");
        System.out.println("1.�γ�  2.�ͳ�");
        int carType = scanner.nextInt();
        if (carType == 1) {
            CarData.display_Car();
            while (true) {
                System.out.println("���������˻��ĳ����ı��");
                int carnumber = scanner.nextInt();
                Car car = CarData.getCar(carnumber);
                if (car != null) {
                    car.car_Num++;
                    break;
                } else {
                    System.out.println("������ĳ�����Ϣ������,����������");
                    continue;
                }
            }
            System.out.println("�˻��ɹ�");
        } else {
            CarData.display_Bus();
            while (true) {
                System.out.println("���������˻��ĳ����ĳ��ƺ�");
                int busnumber = scanner.nextInt();

                Bus bus = CarData.getBus(busnumber);
                if (bus != null) {
                    bus.car_Num++;
                    break;
                } else {
                    System.out.println("������ĳ�����Ϣ�����ڣ�����������");
                    continue;
                }
            }
            System.out.println("�˻��ɹ�");
        }
        scanner.close();
    }


    public static void display_Car(List<Vehicle> listCar) {
        //System.out.printf("����:    Ʒ��     ����     ʣ������     �����\t\n");
        System.out.println();
        //System.out.println(cars.size());
        for (int i = 0; i < listCar.size(); i++) {
            listCar.get(i).printCarInfo();
        }
    }
}
//        //�½�һ��������ϵͳ
//        RentService service = new RentService();
//        Scanner scanner = new Scanner(System.in);
//        service.menu();
//        int chooseNum = scanner.nextInt();






