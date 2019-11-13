package stalls;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public int getRating() {
        return super.getRating();
    }

    public String getName() {
        return super.getName();
    }
}
