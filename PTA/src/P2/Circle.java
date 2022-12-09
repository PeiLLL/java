package P2;

public class Circle {
    private int radius;

    public Circle() {
        radius = 2;
        System.out.println("this is a constructor");
    }

    public Circle(int radius) {
        if(radius <= 0)
            radius = 2;
        this.radius = radius;
        System.out.println("this is a constructor with para");

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius <= 0)
            radius = 2;
        this.radius = radius;
    }

    public int getArea(){
        return (int)(Math.PI*radius*radius);
    }

    public String toSting(){
        return "Circle [radius=" + radius + "]";
    }
}
