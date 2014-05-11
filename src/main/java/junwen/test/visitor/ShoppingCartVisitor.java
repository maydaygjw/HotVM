package junwen.test.visitor;

/**
 * Created by junior on 5/10/14.
 */
public interface ShoppingCartVisitor {

    void visitBook(Book book);

    void visitFruit(Fruit fruit);

    double getTotalPostage();
}
