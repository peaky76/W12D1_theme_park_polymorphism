import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

//ThemePark stores all Attractions and Stalls in it.
//ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed objects.
//Add an empty visitedAttractions ArrayList to Visitor which stores a list of Attractions and a method to add an attraction to the list.
//ThemePark has a method visit(Visitor, Attraction) calls for the attraction to increment its visitCount by 1 and adds the attraction to the visitors visitedAttractions list.

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
}
