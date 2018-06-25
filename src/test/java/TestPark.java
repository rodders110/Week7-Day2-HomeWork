import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPark {

    Park park;

    @Before
    public void before(){
        park = new Park("Central");
    }

    @Test
    public void canGetName() {
        assertEquals("Central", park.getName());
    }
}
