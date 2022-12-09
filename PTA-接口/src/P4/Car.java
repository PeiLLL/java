package P4;

import java.util.Arrays;

public class Car implements Cloneable{
    private String name;
    private CarDriver driver;
    private int[] scores;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarDriver getDriver() {
        return driver;
    }

    public void setDriver(CarDriver driver) {
        this.driver = driver;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public Car(){}

    @Override
    public String toString() {
        return "Car [name=" + name + ", driver=" + driver + ", scores=" + Arrays.toString(scores) + "]";
    }
    @Override
    public Object clone() {  //重写clone方法
        Car c = null;
        try {
            c = (Car) super.clone(); //调用父类Object实现浅拷贝
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //编写代码实现深拷贝

return 0;
    }

}
