package junwen.test.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by junior on 5/10/14.
 */
public class ShoppingCartClient {


    public static void main(String[] args) {

        ShoppingCartClient client = new ShoppingCartClient();
        List<ItemElement> items = client.wire();
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        for(ItemElement ele: items) {
            ele.accept(visitor);
        }

        System.out.println("Total Postage : " + visitor.getTotalPostage());
    }

    public List<ItemElement> wire() {

        List<ItemElement> itemsInCart = new ArrayList<ItemElement>();

        Book bk = new Book();
        bk.setPrice(5);
        bk.setIsbnNumber(9092938);
        Fruit ft = new Fruit();
        ft.setName("Lemon");
        ft.setPricePerKg(10);
        ft.setWeight(20);

        itemsInCart.add(bk);
        itemsInCart.add(ft);

        return itemsInCart;

    }
}
