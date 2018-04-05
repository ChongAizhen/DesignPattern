package FactoryMethod;

/**
 * Created by chongaizhen on 2018/04/05.
 */
public class FactoryTest3 {

    public static void main(String[] args) {
        Sender sender = SendFactory3.produceMail();
        sender.send();
    }
}
