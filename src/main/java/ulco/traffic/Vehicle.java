package ulco.traffic;

public class Vehicle {
    public Vehicle() {
        speed = 0;
    }

    public double speed() {
        return this.speed;
    }

    public void speed(double speed) {
        this.speed = speed;
    }

    private double speed;
}
