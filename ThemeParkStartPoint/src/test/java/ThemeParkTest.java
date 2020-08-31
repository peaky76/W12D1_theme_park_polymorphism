import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

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
    Visitor visitor11;
    Visitor visitor16;
    Visitor visitor21;

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

        visitor11 = new Visitor(11, 190, 100);
        visitor16 = new Visitor(16, 190, 100);
        visitor21 = new Visitor(21, 190, 100);
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
        themePark.visit(visitor21, dodgems);
        assertEquals(1, dodgems.getVisitCount());
        assertEquals(1, visitor21.getVisitedAttractions().size());
    }

    @Test
    public void canGetReviews() {
        assertEquals(7, (int) themePark.getReviews().get("Fun Zone"));
    }

    @Test
    public void canGetAllAllowedFor11YO() {
        ArrayList<IReviewed> allowedToVisit = themePark.getAllAllowedFor(visitor11);
        assertEquals(5, allowedToVisit.size());
        assertEquals(false, allowedToVisit.contains(tobaccoStall));
        assertEquals(false, allowedToVisit.contains(rollerCoaster));
        assertEquals(true, allowedToVisit.contains(playground));
    }

    @Test
    public void canGetAllAllowedFor16YO() {
        ArrayList<IReviewed> allowedToVisit = themePark.getAllAllowedFor(visitor16);
        assertEquals(5, allowedToVisit.size());
        assertEquals(false, allowedToVisit.contains(tobaccoStall));
        assertEquals(true, allowedToVisit.contains(rollerCoaster));
        assertEquals(false, allowedToVisit.contains(playground));
    }

    @Test
    public void canGetAllAllowedFor21YO() {
        ArrayList<IReviewed> allowedToVisit = themePark.getAllAllowedFor(visitor21);
        assertEquals(6, allowedToVisit.size());
        assertEquals(true, allowedToVisit.contains(tobaccoStall));
        assertEquals(true, allowedToVisit.contains(rollerCoaster));
        assertEquals(false, allowedToVisit.contains(playground));
    }

}
