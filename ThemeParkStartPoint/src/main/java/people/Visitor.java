package people;

import attractions.Attraction;

import java.util.ArrayList;
import java.util.Collection;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> visitedAttractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<Attraction>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Attraction> getVisitedAttractions() {
        return this.visitedAttractions;
    }

    public void addVisit(Attraction attraction) {
        this.visitedAttractions.add(attraction);
    }

}
