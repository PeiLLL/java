package P10;

public class RTriangle implements IShape{
    private double r1;
    private double r2;

    public double getR1() {
        return r1;
    }

    public void setR1(double r1) {
        this.r1 = r1;
    }

    public double getR2() {
        return r2;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }

    public RTriangle() {
    }

    public RTriangle(double r1, double r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double getArea() {
        return (1/2.0)*getR1()*getR2();
    }


    @Override
    public double getPerimeter() {
        return (getR1()+getR2()+(Math.sqrt(Math.pow(getR1(),2)+Math.pow(getR2(),2))));
    }
}
