import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Finn on 23/07/2017.
 */
public class ItemTest {

    Item item;

    @Before
    public void before() {
        item = new Item("dog lead", 13.0, "adjustable");
    }

    @Test
    public void hasName() {
        assertEquals("dog lead", item.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(13.0, item.getPrice(), 0.01);
    }

    @Test
    public void hasDescription() {
        assertEquals("adjustable", item.getDescription());
    }
}
