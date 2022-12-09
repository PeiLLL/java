package P3;

public class Fan {
    final int SIOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SIOW;
    private boolean on = false;
    private double radius = 5;
    String color = "white";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = SIOW;
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String toString(){
        if(on = true)
            System.out.println("speed "+SIOW);
            System.out.println("color "+color);

            return "fan is off"+color+radius;
    }
}
