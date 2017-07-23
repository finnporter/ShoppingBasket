import java.util.ArrayList;

/**
 * Created by Finn on 23/07/2017.
 */
public class Basket {

    private double cash;
    private ArrayList<Item> cart;

    public Basket(double cash) {
        this.cash = cash;
        this.cart = new ArrayList<Item>();
    }

    public double getCash() {
        return cash;
    }
}
