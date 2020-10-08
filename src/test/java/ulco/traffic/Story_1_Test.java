package ulco.traffic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ulco.traffic.*;

public class Story_1_Test {
    @Test
    public void vehicle_have_same_speed_than_segment() {
        // creation d’un segment de longueur 200m et avec une vitesse de 10 m/s
        Segment segment = new Segment(200, 10);
        // creation d’un vehicule
        Vehicle vehicle = new Vehicle();

        // placement du vehicule au debut du segment
        segment.addVehicle(vehicle);
        for (double time = 0; time <= 20; time += 1) {
            // le vehicule du segment avance
            segment.run(time);

            assertEquals(vehicle.speed(), segment.speed(), 1e-5);

        }
    }
}