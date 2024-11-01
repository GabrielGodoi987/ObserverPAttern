package Subject;

import java.util.List;

public class Coin {
    protected String name;
    protected List<Float> historyValues;
    protected float price;
    protected boolean isOnRise;

    public void updatePrice(float newPrice){
        this.price = newPrice;
    }
    public void notify(String obs){
        System.out.println(obs);
    }
}
