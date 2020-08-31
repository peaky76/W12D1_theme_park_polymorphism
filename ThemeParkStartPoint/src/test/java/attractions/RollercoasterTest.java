package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor shortAdult;
    Visitor tooYoung;
    Visitor tallAdult;

    @Before
    public void setUp() {

        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        shortAdult = new Visitor(18, 140, 30);
        tooYoung = new Visitor(11, 180, 30);
        tallAdult = new Visitor( 25, 220, 30);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void willRefuseTooShort() { assertEquals(false, rollerCoaster.isAllowedTo(shortAdult)); }

    @Test
    public void willRefuseTooYoung() { assertEquals(false, rollerCoaster.isAllowedTo(tooYoung)); }

    @Test
    public void willAllowTallAndOldEnough() { assertEquals(true, rollerCoaster.isAllowedTo(tallAdult)); }

    @Test
    public void chargesCorrectPriceForShortAdult() { assertEquals(8.40, rollerCoaster.priceFor(shortAdult), 0.01); }

    @Test
    public void chargesCorrectPriceForTallAdult() { assertEquals(16.80, rollerCoaster.priceFor(tallAdult), 0.01);}

}
