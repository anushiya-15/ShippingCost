import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingCostTest {

    ShippingCost s = new ShippingCost();

    @Test
    void testCostForBelow100Km() {

        assertEquals(250,
                s.calculateCost(50),
                0.1);
    }

    @Test
    void testCostFor200Km() {

        assertEquals(800,
                s.calculateCost(200),
                0.1);
    }

    @Test
    void testCostForAbove300Km() {

        assertEquals(1200,
                s.calculateCost(400),
                0.1);
    }
}