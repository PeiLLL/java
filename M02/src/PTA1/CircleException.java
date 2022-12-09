package PTA1;

public class CircleException extends Exception{
    double r;
    public CircleException(double r){
        this.r =r;
    }
    void print(){
        System.out.println("圆的半径为"+this.r+"不合理");
    }

}
