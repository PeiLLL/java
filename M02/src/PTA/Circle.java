package PTA;

public class Circle implements IGeometry {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return r*r*3.14;
    }

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }
}
