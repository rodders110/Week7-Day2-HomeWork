import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCandyFlossStall {
    private String name;
    private String ownerName;
    private int parkingSpot;
    private CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Thompson's", "Jimmy Jones", 2);
    }

    @Test
    public void getName() {
        assertEquals("Thompson's", candyFlossStall.getName());
    }

    @Test
    public void getowenerName() {
        assertEquals("Jimmy Jones", candyFlossStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals(2, candyFlossStall.getParkingSpot());
    }
}

