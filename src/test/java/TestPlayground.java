import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayground {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("Pirate's Bay");
        visitor1 = new Visitor("Charlie", 13, 110, 20.00);
        visitor2 = new Visitor("Tom", 16, 150, 20.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Pirate's Bay", playground.getName());
    }

    @Test
    public void canGetAccess() {
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void cannotGetAccess() {
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
