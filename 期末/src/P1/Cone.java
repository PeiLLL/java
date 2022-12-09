package P1;

import javax.swing.*;

public class Cone {
    private double height;
    private Circle circle;

    public Cone(double height, Circle circle) {
        this.height = height;
        this.circle = circle;
    }
    public Cone(){
        height = 0;
        circle.setRadius(0);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public double getVolume(){
        return (1/3.0)*height*circle.getArea();
    }
    public String toString(){
        return (("Cone(h:"+String.format("%.2f",height)+","+"Circle(r:"+String.format("%.2f",circle.getRadius())+"))"));
    }
}
