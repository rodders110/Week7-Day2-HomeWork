import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTobaccoStall {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private TobaccoStall tobaccoStall;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Tommy's Smokes", "Tommy Sarkins", 3);
        visitor1 = new Visitor("Frank", 21, 160, 120.00);
        visitor2 = new Visitor("Bob", 16, 150, 100.00);
    }

    @Test
    public void getName() {
        assertEquals("Tommy's Smokes", tobaccoStall.getName());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Tommy Sarkins", tobaccoStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals(3, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canGetAccess() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void cannotGetAccess() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
    }
}
