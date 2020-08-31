package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor tooshort;
    Visitor tooyoung;
    Visitor talladult;

    @Before
    public void setUp() {

        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        tooshort = new Visitor(18, 140, 30);
        tooyoung = new Visitor(11, 180, 30);
        talladult = new Visitor( 25, 180, 30);
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
    public void willRefuseTooShort() { assertEquals(false, rollerCoaster.isAllowedTo(tooshort)); }

    @Test
    public void willRefuseTooYoung() { assertEquals(false, rollerCoaster.isAllowedTo(tooyoung)); }

    @Test
    public void willAllowTallAndOldEnough() { assertEquals(true, rollerCoaster.isAllowedTo(talladult)); }
}
