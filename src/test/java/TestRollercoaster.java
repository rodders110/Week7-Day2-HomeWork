import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRollercoaster {

    Rollercoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        rollerCoaster = new Rollercoaster("Oblivion");
        visitor1 = new Visitor("Tommy", 11, 110, 20.00);
        visitor2 = new Visitor("Rodger", 16, 210, 20.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Oblivion", rollerCoaster.getName());
    }

    @Test
    public void canStartRide() {
        assertEquals("Ride Started", rollerCoaster.startRide());
    }

    @Test
    public void canStopRide() {
        assertEquals("Stopped", rollerCoaster.stopRide());
    }

    @Test
    public void canGetAccess() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void cannotGetAccess() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }
}
