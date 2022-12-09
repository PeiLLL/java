package RentCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//租赁系统
public class RentService {

    public static void main(String[] args) {
        List<Vehicle> listCar = new ArrayList<Vehicle>();
        ArrayList<Vehicle> listBus = new ArrayList<Vehicle>();
        ArrayList<Vehicle> listTrunk = new ArrayList<Vehicle>();

        listCar.add(new Car(1, "宝马", "X6", "京NY28588", 10, 800));
        listCar.add(new Car(2, "宝马", "550i", "京CNY3284", 10, 600));
        listCar.add(new Car(3, "别克", "林荫大道", "京NT37465", 5, 300));
        listCar.add(new Car(4, "别克", "GL8", "京NT96968", 8, 600));


        listBus.add(new Bus(1, "金杯", "京6566754", 10, 16, 800));
        listBus.add(new Bus(2, "金杯", "京8696997", 10, 16, 800));
        listBus.add(new Bus(3, "金龙", "京9696996", 8, 34, 1500));
        listBus.add(new Bus(4, "金龙", "京8696998", 8, 34, 1500));
        //新建一个服务器系统
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
                System.out.println("您已退出该系统");
                System.exit(0);
            } else {
                System.out.println("输入错误，请重新输入");
                continue;
            }
        }
    }

    void menu() {
        System.out.println("====欢迎来到1" + "汽车租赁中心====");
        System.out.println("====请选择你需要的服务====");
        System.out.println("1.租赁车辆 2.退换车辆 0.退出该系统");
    }

    //租赁车辆服务内容
    void rentCar() {
        System.out.println("====请选择您需要的汽车类型====");
        System.out.println("1.轿车  2.客车");
        Scanner scanner = new Scanner(System.in);
        int carType = scanner.nextInt();
        if (carType == 1) {
            while (true) {
                System.out.println("下面是目前拥有的轿车：");
                CarData.display_Car();
                System.out.println("请输入您选择要租的汽车编号");
                int carnumber = scanner.nextInt();
                Car rentalCar = CarData.getCar(carnumber);
                if (rentalCar != null && rentalCar.car_Num > 0) {
                    //如果存在这辆车，并且数量大于零。就输入租用天数，计算总租金
                    System.out.println("请选择您要租用轿车的时长(天)");
                    int days = scanner.nextInt();
                    double totalRent = rentalCar.calRent(days);
                    System.out.println("您本次租车的总租金为 " + totalRent + "元");
                    //将该型汽车的数量减1
                    rentalCar.car_Num--;
                    break;
                } else {
                    //车辆不存在或者数量不够
                    System.out.println("对不起，您选择的车辆不存在或数量不足，请重新输入");
                    continue;
                }
            }
        } else if (carType == 2) {
            while (true) {
                System.out.println("下面是目前拥有的客车：");
                CarData.display_Bus();
                System.out.println("请输入您选择要租的客车编号");
                int busnumber = scanner.nextInt();
                Bus rentalCar = CarData.getBus(busnumber);
                if (rentalCar != null && rentalCar.car_Num > 0) {
                    //如果存在这辆车，并且数量大于零。就输入租用天数，计算总租金
                    System.out.println("请选择您要租用客车的时长(天)");
                    int days = scanner.nextInt();
                    double totalRent = rentalCar.calRent(days);
                    System.out.println("您本次租车的总租金为 " + totalRent + "元");
                    //将该型汽车的数量减1
                    rentalCar.car_Num--;
                    break;
                } else {
                    //车辆不存在或者数量不够
                    System.out.println("对不起，您选择的车辆不存在或数量不足，请重新输入");
                    continue;
                }
            }
        }
        scanner.close();
    }

    void sendBack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您退还的车辆类型");
        System.out.println("1.轿车  2.客车");
        int carType = scanner.nextInt();
        if (carType == 1) {
            CarData.display_Car();
            while (true) {
                System.out.println("请输入您退还的车辆的编号");
                int carnumber = scanner.nextInt();
                Car car = CarData.getCar(carnumber);
                if (car != null) {
                    car.car_Num++;
                    break;
                } else {
                    System.out.println("您输入的车辆信息不存在,请重新输入");
                    continue;
                }
            }
            System.out.println("退还成功");
        } else {
            CarData.display_Bus();
            while (true) {
                System.out.println("请输入您退还的车辆的车牌号");
                int busnumber = scanner.nextInt();

                Bus bus = CarData.getBus(busnumber);
                if (bus != null) {
                    bus.car_Num++;
                    break;
                } else {
                    System.out.println("您输入的车辆信息不存在，请重新输入");
                    continue;
                }
            }
            System.out.println("退还成功");
        }
        scanner.close();
    }


    public static void display_Car(List<Vehicle> listCar) {
        //System.out.printf("车型:    品牌     车名     剩余数量     日租金\t\n");
        System.out.println();
        //System.out.println(cars.size());
        for (int i = 0; i < listCar.size(); i++) {
            listCar.get(i).printCarInfo();
        }
    }
}
//        //新建一个服务器系统
//        RentService service = new RentService();
//        Scanner scanner = new Scanner(System.in);
//        service.menu();
//        int chooseNum = scanner.nextInt();






