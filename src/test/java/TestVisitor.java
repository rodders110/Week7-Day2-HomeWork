import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestVisitor {

    private Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Tommy",14, 160, 40.00);
    }

    @Test
    public void canGetAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void canGetName() {
        assertEquals("Tommy", visitor.getName());
    }

    @Test
    public void canGetHeight() {
        assertEquals(160, visitor.getHeight());
    }

    @Test
    public void canGetFunds() {
        assertEquals(40.00, visitor.getFunds());
    }

    @Test
    public void candeductFunds() {
        visitor.deductFunds(9);
        assertEquals(31.00, visitor.getFunds());
    }
}
