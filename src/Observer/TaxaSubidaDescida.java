package Observer;

import Subject.Coin;

import java.util.ArrayList;
import java.util.List;

public class TaxaSubidaDescida implements Observer{
    private List<Coin> subscribers;

    public TaxaSubidaDescida(){
        this.subscribers = new ArrayList<>();
    }
    @Override
    public void subscribeSubs(Coin moeda) {
        this.subscribers.add(moeda);
        this.notifyOne(moeda, "A moeda está inscrita na TaxaSubidaDescida");
    }

    @Override
    public void unsubscribeSubs(Coin moeda) {
        this.subscribers.remove(moeda);
    }

    @Override
    public void notifyAllSubs(String assunto) {
        for(Coin el: subscribers){
            el.notify(assunto);
        }
    }

    @Override
    public void notifyOne(Coin moeda, String assunto) {
        moeda.notify(assunto);
    }
}
