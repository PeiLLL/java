package P2;

public class Ring {
    private int innerRadius;
    private int outerRadius;

    public Ring(int innerRadius, int outerRadius) {
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
        System.out.println("constructor");
    }

    public Ring() {
        this(1,3);
    }

    public int getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(int innerRadius) {
        this.innerRadius = innerRadius;
    }

    public int getOuterRadius() {
        return outerRadius;
    }

    public void setOuterRadius(int outerRadius) {
        this.outerRadius = outerRadius;
    }

    public int getArea(){
        return (int) ((Math.PI*(outerRadius*outerRadius-innerRadius*innerRadius)));
    }

}
