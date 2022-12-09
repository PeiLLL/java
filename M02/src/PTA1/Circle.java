package PTA1;

public class Circle {
    double r;
    public Circle(double r){
        this.r = r;
    }
    double area() throws CircleException{
        if(this.r < 0){
            throw new CircleException(this.r);
        }
        return 3.14*r*r;
    }
}
