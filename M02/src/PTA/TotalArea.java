package PTA;

public class TotalArea {
    public IGeometry[] tuxing;
    public void setTuxing(IGeometry[] t){
        this.tuxing = t;
    }

    public double computerTotalArea(){
        double sum = 0;
        for (IGeometry i:tuxing) {
            sum += i.getArea();
        }
        return sum;
    }
}
