package junwen.test.visitor;

/**
 * Created by junior on 5/10/14.
 */
public interface ItemElement {

    void accept(ShoppingCartVisitor shoppingCartVisitor);
}
