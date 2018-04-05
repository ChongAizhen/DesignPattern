package FactoryMethod;

/**
 * Created by chongaizhen on 2018/04/05.
 */
public class FactoryTest2 {

    public static void main(String[] args) {
        SendFactory2 factory = new SendFactory2();
        Sender sender = factory.produceMail();
        sender.send();
    }
}
