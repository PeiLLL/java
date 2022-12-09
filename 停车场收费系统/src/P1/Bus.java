package P1;

public class Bus extends Vehicle{
    int seats;
    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    float rent = 0;
    @Override
    public float computeFee() {
        if(getMinute()%60 == 0)
            rent = getMinute()/60*this.getPrice();
        else if(getMinute()%60 > 0 && getMinute()%60 <= 30)
            rent = (float) ((getMinute()/60+0.5)*this.getPrice());
        else if(getMinute()%60 > 30)
            rent = (getMinute()/60+1)*this.getPrice();
        return rent;
    }
}
