package attractions;
import people.Visitor;

import behaviours.ISecurity;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15) {
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
