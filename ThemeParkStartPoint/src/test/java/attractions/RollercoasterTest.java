package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor tooShort;
    Visitor tooYoung;
    Visitor tallAdult;

    @Before
    public void setUp() {

        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        tooShort = new Visitor(18, 140, 30);
        tooYoung = new Visitor(11, 180, 30);
        tallAdult = new Visitor( 25, 180, 30);
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
    public void willRefuseTooShort() { assertEquals(false, rollerCoaster.isAllowedTo(tooShort)); }

    @Test
    public void willRefuseTooYoung() { assertEquals(false, rollerCoaster.isAllowedTo(tooYoung)); }

    @Test
    public void willAllowTallAndOldEnough() { assertEquals(true, rollerCoaster.isAllowedTo(tallAdult)); }
}
