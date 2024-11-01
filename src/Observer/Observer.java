package Observer;
import Subject.Coin;

public interface Observer {
    void subscribeSubs(Coin moeda);
    void unsubscribeSubs(Coin moeda);
    void notifyAllSubs(String assunto);
    void notifyOne(Coin moeda, String assunto);
}
