package attractions;
import people.Visitor;
import behaviours.ITicketed;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public int getRating() {
        return super.getRating();
    }

    public String getName() {
        return super.getName();
    }

    public double defaultPrice() {
        double defaultPrice = 4.50;
        return defaultPrice;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return this.defaultPrice() / 2;
        }
        return this.defaultPrice();
    }
}
