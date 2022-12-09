package P1;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(){
        radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*3.1415926535;
    }

    public double getPerimeter(){
        return 2*radius*3.1415926535;
    }
    public String toString(){
        return (("Circle(r:"+String .format("%.2f",radius)+")"));
    }
}
