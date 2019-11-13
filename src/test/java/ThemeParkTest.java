import attractions.*;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themepark;
    Dodgems dodgems;
    IceCreamStall iceCreamStall;
    Visitor visitor;

    @Before
    public void before() {
        themepark = new ThemePark(dodgems, iceCreamStall);
        dodgems = new Dodgems("Something1", 4);
        iceCreamStall = new IceCreamStall("Something2", "Adam", ParkingSpot.A1, 4);
        visitor = new Visitor(25, 180, 20);
    }

    @Test
    public void visit() {
        themepark.visit(visitor, dodgems);
        assertEquals(1, visitor.checkList());
        assertEquals(1, dodgems.getVisitCount());
    }

}
