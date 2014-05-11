package junwen.test.visitor;

/**
 * Created by junior on 5/10/14.
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    private double totalPostage;

    @Override
    public void visitBook(Book book) {

        if(book.getPrice() < 10) {
            totalPostage += 5;
        }
    }

    @Override
    public void visitFruit(Fruit fruit) {

        totalPostage += fruit.getWeight() * 0.5;
    }

    @Override
    public double getTotalPostage() {
        return totalPostage;
    }
}
