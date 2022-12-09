package P1;

public class Car extends Vehicle{
    int f = getMinute()%60;
    int h = getMinute()/60;

    public Car(float price, int minute) {
        super(price, minute);
    }
    float rent =0;
    @Override
    public float computeFee() {
        if(getMinute()%60 == 0)
            rent = getMinute()/60*getPrice();
        else if(getMinute()%60 > 0 && getMinute()%60<= 30)
            rent = getMinute()/60*getPrice();
        else if(getMinute()%60>  30)
            rent = (getMinute()/60+1)*getPrice();
        return rent;
    }
}
