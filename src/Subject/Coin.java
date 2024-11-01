package Subject;

import java.util.ArrayList;
import java.util.List;

public class Coin {
    protected String name;
    protected List<Float> historyValues = new ArrayList<>();
    protected float price;
    protected boolean isOnRise;

    public void updatePrice(float newPrice){
        this.historyValues.add(this.price);
        this.price = newPrice;
    }
    public void notify(String obs){
        System.out.println(obs);
    }
}
