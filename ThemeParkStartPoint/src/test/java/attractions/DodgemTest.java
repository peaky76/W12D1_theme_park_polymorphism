package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor u12;
    Visitor adult;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        u12 = new Visitor(11, 120, 10);
        adult = new Visitor(49, 180, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void chargesCorrectPriceForU12() { assertEquals(2.25, dodgems.priceFor(u12), 0.01); }

    @Test
    public void chargesCorrectPriceForAdult() { assertEquals(4.50, dodgems.priceFor(adult), 0.01);}

}
