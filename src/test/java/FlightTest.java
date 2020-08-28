import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        plane = new Plane(PlaneType.BOEING767);
        flight = new Flight(plane, "FR869", "GLA", "FR", "16:30");
    }

    @Test
    public void name() {
    }
}
