package PTA1;

public class CircleException extends Exception{
    double r;
    public CircleException(double r){
        this.r =r;
    }
    void print(){
        System.out.println("Բ�İ뾶Ϊ"+this.r+"������");
    }

}
