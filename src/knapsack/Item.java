package knapsack;

/**
 * Created by gonzalo on 10/2/15.
 */
public class Item {
    private int weight = 0;
    private int value = 0;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }
}
