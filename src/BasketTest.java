import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Finn on 23/07/2017.
 */
public class BasketTest {

    Basket basket;
    Item item1;
    Item item2;

    @Before
    public void before() {
        basket = new Basket(0.0);
        item1 = new Item("dog lead", 13.0, "adjustable");
        item2 = new Item("dog collar", 11.0, "soft");
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
    public void canSetTotal() {
        basket.setTotal(10.0);
        assertEquals(10.0, basket.getTotal(), 0.01);
    }

    @Test
    public void addsItemToCart() {
        basket.addItem(item1);
        assertEquals(1, basket.getCart());
    }

    @Test
    public void removesItemFromCart() {
        basket.addItem(item1);
        basket.removeItem(item1);
        assertEquals(0, basket.getCart());
    }

    @Test
    public void removeAllItemsFromCart() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.emptyOutCart();
        assertEquals(0, basket.getCart());
    }

    @Test
    public void canCalcTotal() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.calcTotal();
        assertEquals(24, basket.getTotal(), 0.01);
    }

    @Test
    public void canCalcOccurences() {
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item2);
        basket.addItem(item2);
        basket.countOccurencesOfSameItemInCart();
        assertEquals(2, basket.getQuantityHashItem(item1));
        assertEquals(3, basket.getQuantityHashItem(item2));
    }

}
