import java.util.ArrayList;
import java.util.Collections;

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

    public void setTotal(double total) {
        this.total = total;
    }

    public void addItem(Item item) {
        cart.add(item);
    }

    public void removeItem(Item item) {
        cart.remove(item);
    }

    public void emptyOutCart() {
        cart.clear();
    }

    public double calcTotal() {
        double sum = 0;
        for (Item item : cart) {
            sum += item.getPrice();
        }
        setTotal(sum);
        return this.total;
    }

    public int countOccurancesOfSameItemInCart() {
        int occurances = 0;
        for (Item item : cart) {
            occurances = Collections.frequency(cart, item);
        }
        return occurances;
    }


}
