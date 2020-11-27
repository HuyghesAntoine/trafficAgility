package ulco.traffic;

public class Vehicle {
    public Vehicle() {
        position = 0;
        speed = 0;
        start_time = 0;
    }

    public double position() {
        return position;
    }

    public void run(double time) {
        position = speed * (time - start_time);
    }

    public double speed() {
        return speed;
    }

    public void start(double t, double s) {
        start_time = t;
        position = 0;
        speed = s;
    }

    private double position;
    private double speed;
    private double start_time;
}
