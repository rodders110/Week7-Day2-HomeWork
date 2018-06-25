import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDodgems {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Jammy Dodgers");
    }

    @Test
    public void canGetName() {
        assertEquals("Jammy Dodgers", dodgems.getName());
    }

    @Test
    public void canStartRide() {
        assertEquals("Ride Started", dodgems.startRide());
    }

    @Test
    public void canStopRide() {
        assertEquals("Stopped", dodgems.stopRide());
    }
}
