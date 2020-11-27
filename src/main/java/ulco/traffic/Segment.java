package ulco.traffic;

import java.util.LinkedList;

public class Segment {
    public Segment(double length, double speed) {
        this.length = length;
        this.speed = speed;
        next = null;
        current_time = 0;
    }

    public void addNext(Segment n) {
        next = n;
    }

    void addVehicle(Vehicle vehicle) {
        vehicle.start(current_time, speed);
        moving_vehicles.add(vehicle);
    }

    public void run(double time) {
        LinkedList<Vehicle> list = new LinkedList<>();
        int i = 0;

        current_time = time;
        while (i < moving_vehicles.size()) {
            Vehicle vehicle = moving_vehicles.get(i);

            vehicle.run(time);
            if (vehicle.position() >= length) {
                if (next != null) {
                    next.addVehicle(vehicle);
                }
            } else {
                list.add(vehicle);
            }
            ++i;
        }
        moving_vehicles = list;
    }

    public double speed() {
        return this.speed;
    }

    public boolean vehiclePresent(Vehicle vehicle) {
        return moving_vehicles.contains(vehicle);
    }

    private double current_time;
    private Segment next;
    private final double length;
    private LinkedList<Vehicle> moving_vehicles = new LinkedList<>();
    private final double speed;
}
