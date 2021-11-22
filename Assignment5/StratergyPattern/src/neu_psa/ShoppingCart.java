package neu_psa;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;
    public ShoppingCart(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public int calculateTotal(){
        int totalSum = 0;
        for(Item item : items){
            totalSum = totalSum + item.getPrice();
        }
        return totalSum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotal());
    }
}
