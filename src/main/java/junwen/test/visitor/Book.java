package junwen.test.visitor;

/**
 * Created by junior on 5/10/14.
 */
public class Book implements ItemElement {

    private int price;
    private int isbnNumber;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    @Override
    public void accept(ShoppingCartVisitor shoppingCartVisitor) {

        shoppingCartVisitor.visitBook(this);
    }
}
