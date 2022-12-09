package PTA;

public class Rect implements IGeometry {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    public Rect() {
    }

    public Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
