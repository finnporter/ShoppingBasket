import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Finn on 23/07/2017.
 */
public class BasketTest {

    Basket basket;
    Item item;

    @Before
    public void before() {
        basket = new Basket(0.0);
        item = new Item("dog lead", 13.0, "adjustable");
    }

    @Test
    public void hasTotal() {
        assertEquals(0.0, basket.getTotal(), 0.01);
    }

    @Test
    public void cartStartsEmpty() {
        assertEquals(0, basket.getCart());
    }

    @Test
    public void addItemToCart() {
        basket.addItem(item);
        assertEquals(1, basket.getCart());
    }

    @Test
    public void removeItemFromCart() {
        basket.addItem(item);
        basket.removeItem(item);
        assertEquals(0, basket.getCart());
    }
}
