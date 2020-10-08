package ulco.traffic;

public class Segment {
    public Segment(double length, double speed) {
        this.length = length;
        this.speed = speed;
    }

    void addVehicle(Vehicle vehicle) {
        vehicle.speed(speed);
    }

    void run(double time) {
    }

    public double speed() {
        return this.speed;
    }

    private double length;
    private double speed;
}
