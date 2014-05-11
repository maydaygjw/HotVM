package junwen.test.visitor;

/**
 * Created by junior on 5/10/14.
 */
public class Fruit implements ItemElement {

    private int pricePerKg;

    private int weight;

    private String name;

    public int getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(ShoppingCartVisitor shoppingCartVisitor) {
        shoppingCartVisitor.visitFruit(this);
    }
}
