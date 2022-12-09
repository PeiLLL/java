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
    public Object clone() {  //��дclone����
        Car c = null;
        try {
            c = (Car) super.clone(); //���ø���Objectʵ��ǳ����
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //��д����ʵ�����

return 0;
    }

}
