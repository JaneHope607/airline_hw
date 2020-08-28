import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Jane O'Donnell", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Jane O'Donnell", passenger.getName());

    }

    @Test
    public void canGetBags() {
        assertEquals(2, passenger.getBags());
    }
}
