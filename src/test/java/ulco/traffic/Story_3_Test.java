package ulco.traffic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Story_3_Test {
    @Test
    public void vehicle_on_segment_and_next_segment() {
        // creation d’un premier segment de longueur 200m et avec une vitesse de 10 m/s
        Segment segment_1 = new Segment(200, 10);
        // creation d’un deuxième segment de longueur 100m et avec une vitesse de 5 m/s
        Segment segment_2 = new Segment(100, 5);
        // creation d’un vehicule
        Vehicle vehicle = new Vehicle();

        // connexion du premier segment au deuxième segment
        segment_1.addNext(segment_2);
        // placement du vehicule au debut du segment
        segment_1.addVehicle(vehicle);
        for (double time = 0; time < 20; time += 1) {
            // le vehicule du segment avance
            segment_1.run(time);
            segment_2.run(time);

            assertTrue(segment_1.vehiclePresent(vehicle));
            assertFalse(segment_2.vehiclePresent(vehicle));
            assertEquals(vehicle.speed(), segment_1.speed(), 1e-5);

        }
        segment_1.run(20);
        segment_2.run(20);

        assertFalse(segment_1.vehiclePresent(vehicle));
        assertTrue(segment_2.vehiclePresent(vehicle));
        assertEquals(vehicle.speed(), segment_2.speed(), 1e-5);

    }
}