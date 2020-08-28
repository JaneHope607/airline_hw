import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING767);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(335, plane.getCapacity());
    }

    @Test
    public void canGetTotalWeight() {
        assertEquals(122000, plane.getWeight());
    }

}
