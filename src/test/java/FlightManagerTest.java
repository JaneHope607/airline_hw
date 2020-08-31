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
        plane = new Plane(PlaneType.BOEING767);
        flight = new Flight(plane, "FR869", "GLA", "FR", "16:30");
        passenger1 = new Passenger("Jane O'Donnell", 1);
        passenger2 = new Passenger("George Ross", 3);
        flightManager = new FlightManager();
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
    }

    @Test
    public void canCalculateBaggageWeightEachPassenger() {
        assertEquals(1, flightManager.baggageWeightEachPassenger(flight));
    }

    @Test
    public void canCalculateBaggageWeightTotal() {
        flight.addPassenger(passenger1);
        assertEquals(3, flightManager.baggageWeightTotal(flight));
    }

    @Test
    public void canCalculateRemainingBaggageWeight() {
        flight.addPassenger(passenger2);
        assertEquals(547, flightManager.getRemainingBaggageWeight(flight));
    }
}