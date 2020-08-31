import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void add(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void add(Stall stall) {
        this.stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> allReviewed;
        allReviewed = new ArrayList<IReviewed>();
        allReviewed.addAll(attractions);
        allReviewed.addAll(stalls);
        return allReviewed;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.addVisit(attraction);
        attraction.addVisit();
    }
}
