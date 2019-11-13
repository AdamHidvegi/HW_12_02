package attractions;

public class Park extends Attraction {

    public Park(String name, int rating) {
        super(name, rating);
    }

    public int getRating() {
        return super.getRating();
    }

    public String getName() {
        return super.getName();
    }
}
