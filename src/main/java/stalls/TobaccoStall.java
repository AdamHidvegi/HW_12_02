package stalls;
import people.Visitor;

import behaviours.ISecurity;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        }
        return false;
    }

    public int getRating() {
        return super.getRating();
    }

    public String getName() {
        return super.getName();
    }
}
