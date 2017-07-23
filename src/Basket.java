import java.util.ArrayList;

/**
 * Created by Finn on 23/07/2017.
 */
public class Basket {

    private double total;
    private ArrayList<Item> cart;

    public Basket(double total) {
        this.total = total;
        this.cart = new ArrayList<Item>();
    }

    public double getTotal() {
        return this.total;
    }

    public int getCart() {
        return this.cart.size();
    }

    public void addItem(Item item) {
        cart.add(item);
    }

    public void removeItem(Item item) {
        cart.remove(item);
    }
}
