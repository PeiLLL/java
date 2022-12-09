package RentCar;
import java.util.ArrayList;
import java.util.List;

public class CarData {
//    protected static Car[] cars;//轿车数组
//    protected static Bus[] buses;//客车数组
//    protected static Trunk[] trunks;//货车
    //初始化数组
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

        listCar.add(new Car(1, "宝马", "X6", "京NY28588", 10, 800));
        listCar.add(new Car(2, "宝马", "550i", "京CNY3284", 10, 600));
        listCar.add(new Car(3, "别克", "林荫大道", "京NT37465", 5, 300));
        listCar.add(new Car(4, "别克", "GL8", "京NT96968", 8, 600));


        listBus.add(new Bus(1, "金杯", "京6566754", 10, 16, 800));
        listBus.add(new Bus(2, "金杯", "京8696997", 10, 16, 800));
        listBus.add(new Bus(3, "金龙", "京9696996", 8, 34, 1500));
        listBus.add(new Bus(4, "金龙", "京8696998", 8, 34, 1500));


    public static void display_Car(listCar) {
        //System.out.printf("车型:    品牌     车名     剩余数量     日租金\t\n");
        System.out.println();
       //System.out.println(cars.size());
        for (int i = 0; i< listCar.size(); i++) {
            listCar.get(i).printCarInfo();
        }
    }

    static void display_Bus() {
        //System.out.printf("车型：车名  品牌名   数量   日租金");
        System.out.println();
        for (int i = 0; i< buses.length; i++) {
            buses[i].printCarInfo();
        }
    }

    public static Car getCar(int carnumber) {
        for (int i = 0; i < cars.length; i++) {
            if (carnumber == cars[i].vehicleNum ) {
                //在轿车数组中找到客户需要的汽车
                return cars[i];
            }
        }
        //没找到返回空
        return null;
    }

    public static Bus getBus(int busnumber) {
        for (int i = 0; i < buses.length; i++) {
            if (busnumber == buses[i].vehicleNum) {
                //在客车数组中找到客户需要的客车
                return buses[i];
            }
        }
        //没找到返回空
        return null;
    }


}
