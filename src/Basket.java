import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Finn on 23/07/2017.
 */
public class Basket {

    private double total;
    private ArrayList<Item> cart;
    protected HashMap<Item, Integer> quantityHash;

    public Basket(double total) {
        this.total = total;
        this.cart = new ArrayList<Item>();
        quantityHash = new HashMap<Item, Integer>();
    }

    public double getTotal() {
        return this.total;
    }

    public int getCart() {
        return this.cart.size();
    }

    public int getQuantityHashItem(Item item) {
        return quantityHash.get(item);
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

    public void countOccurencesOfSameItemInCart() {

        for (Item item : cart) {
            Integer occurrences = quantityHash.get(item);
            if (occurrences == null) {
                quantityHash.put(item, 1);
            }
            else { quantityHash.put(item, occurrences+1); }
            }
            //return quantityHash;
        }
}



