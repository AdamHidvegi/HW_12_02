package stalls;

import behaviours.IReviewed;

public class CandyflossStall extends Stall implements IReviewed {

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public int getRating() {
        return getRating();
    }

    public String getName() {
        return super.getName();
    }
}
