import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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
    }

    public double calcBuyOneGetOneFree() {
        double result = 0;
        Iterator entries = quantityHash.entrySet().iterator();
        while (entries.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry) entries.next();
            Item key = (Item)entry.getKey();
            Integer value = (Integer)entry.getValue();
            for (Item item : cart) {
                if (quantityHash.get(item) % 2 == 0) {
                    result += item.getPrice() * 0.5;
                    setTotal(result);
                }
                else {
                    quantityHash.get(item);{
                        result += item.getPrice() *  0.5;
                        setTotal(result);
                    }
                }
            }
        }
        return this.total;
    }
}



