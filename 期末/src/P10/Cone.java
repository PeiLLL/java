package P10;

public class Cone implements IShape{
    private IShape IS;
    private double h;

    public Cone(IShape IS, double h) {
        this.IS = IS;
        this.h = h;
    }



    public Cone() {
    }

    public IShape getIS() {
        return IS;
    }

    public void setIS(IShape IS) {
        this.IS = IS;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double getVolume(){
        return IS.getArea()*getH()/3.0;
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
