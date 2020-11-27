package ulco.traffic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Story_2_Test {
    @Test
    public void vehicle_on_segment() {
        // creation d’un segment de longueur 200m et avec une vitesse de 10 m/s
        Segment segment = new Segment(200, 10);
        // creation d’un vehicule
        Vehicle vehicle = new Vehicle();

        // placement du vehicule au debut du segment
        segment.addVehicle(vehicle);
        for (double time = 0; time < 20; time += 1) {
            // le vehicule du segment avance
            segment.run(time);

            assertTrue(segment.vehiclePresent(vehicle));

        }
        segment.run(20);

        assertFalse(segment.vehiclePresent(vehicle));

    }
}