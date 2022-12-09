package P2;

public class Square {
    private int edge;

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        if(edge <= 0)
            this.edge = 1;
        else
            this.edge = edge;
    }

    public Square() {
        this.edge = 2;
        System.out.println("this is constructor method");

    }

    class getArea {
        int s = edge*edge;
    }
    public int getArea(){
        return edge*edge;
    }
}
