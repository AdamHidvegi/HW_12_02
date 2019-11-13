import attractions.*;
import behaviours.IReviewed;
import stalls.*;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private Attraction attraction;
    private Stall stall;
    private ArrayList<IReviewed> reviewedPlaces;

    public ThemePark(Attraction attraction, Stall stall) {
        this.reviewedPlaces = new ArrayList<IReviewed>();
        this.attraction = attraction;
        this.stall = stall;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.reviewedPlaces;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.increaseVisitCount();
        visitor.addToList(attraction);
    }

}
