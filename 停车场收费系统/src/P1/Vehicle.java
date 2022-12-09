package P1;
import java.util.Scanner;

public class Vehicle {
        private float price;
        private int minute;
        public Vehicle() {
        }
        public Vehicle(float price, int minute) {
            this.price= price;
            this.minute = minute;
        }

        public float getPrice() {
            return price;
        }
        public void setPrice(float price) {
            this.price = price;
        }
        public int getMinute() {
            return minute;
        }
        public void setMinute(int minute) {
            this.minute = minute;
        }
        public float computeFee(){
            return 20.0f*minute/60;
        }
    }

