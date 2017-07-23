import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Finn on 23/07/2017.
 */
public class BasketTest {

    Basket basket;

    @Before
    public void before() {
        basket = new Basket(0.0);
    }

    @Test
    public void hasTotal() {
        assertEquals(0.0, basket.getTotal(), 0.01);
    }
}
