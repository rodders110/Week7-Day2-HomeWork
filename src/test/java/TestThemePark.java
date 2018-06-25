import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestThemePark {
    Themepark themepark;
    IReviewed rollercoaster;
    IReviewed dodgems;
    IReviewed playground;
    IReviewed tobaccoStall;
    IReviewed candyFlossStall;
    IReviewed iceCreamStall;
    IReviewed park;

    @Before
    public void before(){
        themepark = new Themepark("CodeClan Towers");
        themepark.add(rollercoaster);
        themepark.add(dodgems);
        themepark.add(playground);
        themepark.add(tobaccoStall);
        themepark.add(candyFlossStall);
        themepark.add(iceCreamStall);
        themepark.add(park);

    }

    @Test
    public void canGetAllRated() {
        assertEquals(7, themepark.getReviewed().size());
    }

    @Test
    public void getName() {
        assertEquals("CodeClan Towers", themepark.getName());
    }
}
