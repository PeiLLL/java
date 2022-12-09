package P10;

public class Circle implements IShape{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return getR()*getR()*PI;
    }


    @Override
    public double getPerimeter() {
        return 2*getR()*PI;
    }
}
