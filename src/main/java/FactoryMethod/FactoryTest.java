package FactoryMethod;

/**
 * Created by chongaizhen on 2018/04/04.
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
    }
}
