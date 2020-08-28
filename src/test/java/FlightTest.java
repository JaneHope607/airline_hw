import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    ArrayList<Passenger> passengers;

    @Before
    public void before() {
        passenger1 = new Passenger("Jane O'Donnell",2);
        passenger2 = new Passenger("Tracey Beaker",1    );
        passenger3 = new Passenger("John Smith",4);
        plane = new Plane(PlaneType.BOEING767);
        flight = new Flight(plane, "FR869", "GLA", "FR", "16:30");
    }

    @Test
    public void canGetPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("FR869", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void canGetAirport() {
        assertEquals("FR", flight.getAirport());
    }

    @Test
    public void canGetDepartureTime() {
        assertEquals("16:30", flight.getDepartureTime());
    }

    @Test
    public void startsNoPassengers() {
        assertEquals(0, flight.numberPassengers());
    }

    @Test
    public void canGetRemainingSeats() {
        assertEquals(335, flight.availableSeats());
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger1);
        assertEquals(1, flight.numberPassengers());
        assertEquals(334, flight.availableSeats());
    }

    @Test
    public void cannotAddPassenger() {
        Plane miniPlane = new Plane(PlaneType.AIRBUSMINI);
        Flight miniFlight = new Flight(miniPlane, "GZ125", "EDI", "LDN", "20:00");
        miniFlight.addPassenger(passenger1);
        miniFlight.addPassenger(passenger2);
        miniFlight.addPassenger(passenger3);
        assertEquals(3, miniFlight.numberPassengers());
        assertEquals(0, miniFlight.availableSeats());
    }
}
