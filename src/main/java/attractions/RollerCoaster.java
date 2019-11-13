package attractions;
import behaviours.ITicketed;
import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public int getRating() {
        return super.getRating();
    }

    public String getName() {
        return super.getName();
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 145) {
            return true;
        }
        return false;
    }

    public double defaultPrice() {
        double defaultPrice = 8.40;
        return defaultPrice;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return this.defaultPrice() * 2;
        }
        return this.defaultPrice();
    }
}
