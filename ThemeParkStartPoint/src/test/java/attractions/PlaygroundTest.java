package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor u15;
    Visitor adult;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        u15 = new Visitor(14, 120, 0);
        adult = new Visitor(35, 180, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void permitUnder15s() {assertEquals( true, playground.isAllowedTo(u15)); }

    @Test
    public void denyOver15s() {assertEquals(false, playground.isAllowedTo(adult)); }
}
