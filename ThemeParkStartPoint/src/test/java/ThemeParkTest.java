import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        themePark = new ThemePark();

        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);

        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 5);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 8);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 3);

        themePark.add(dodgems);
        themePark.add(park);
        themePark.add(playground);
        themePark.add(rollerCoaster);
        themePark.add(candyflossStall);
        themePark.add(iceCreamStall);
        themePark.add(tobaccoStall);

        visitor = new Visitor(40, 190, 100);
    }

    @Test
    public void hasAttractions() {
        assertEquals(4, themePark.getAttractions().size());
    }

    @Test
    public void hasStalls() {
        assertEquals(3, themePark.getStalls().size());
    }

    @Test
    public void canGetAllReviewed() {
        assertEquals(7, themePark.getAllReviewed().size());
    }

    @Test
    public void canRegisterAttractionVisit() {
        themePark.visit(visitor, dodgems);
        assertEquals(1, dodgems.getVisitCount());
        assertEquals(1, visitor.getVisitedAttractions().size());
    }

    @Test
    public void canGetReviews() {
        assertEquals(7, (int) themePark.getReviews().get("Fun Zone"));
    }

}
