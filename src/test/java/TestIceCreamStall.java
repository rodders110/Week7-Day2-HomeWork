import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestIceCreamStall {
    private String name;
    private String ownerName;
    private int parkingSpot;
    private IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Charlie's", "David Thompson", 1);
    }

    @Test
    public void getName() {
        assertEquals("Charlie's", iceCreamStall.getName());
    }

    @Test
    public void getowenerName() {
        assertEquals("David Thompson", iceCreamStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals(1, iceCreamStall.getParkingSpot());
    }
}
