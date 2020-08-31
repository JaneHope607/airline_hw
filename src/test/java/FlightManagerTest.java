import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Plane plane;
    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    FlightManager flightManager;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUSMINI);
        flight = new Flight(plane, "FR869", "GLA", "FR", "16:30");
        passenger1 = new Passenger("Jane O'Donnell", 1);
        passenger2 = new Passenger("George Ross", 3);
        flightManager = new FlightManager(flight);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
    }

    @Test
    public void canCalculateBaggageWeightEachPassenger() {
        assertEquals(20, flightManager.baggageWeightEachPassenger());
    }

    @Test
    public void canCalculateBaggageWeightTotal() {
        assertEquals(40, flightManager.baggageWeightTotal());
    }

    @Test
    public void canCalculateRemainingBaggageWeight() {
        assertEquals(60, flightManager.getRemainingBaggageWeight());
    }
}