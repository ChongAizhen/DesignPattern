package AbstractFactory;

/**
 * Created by chongaizhen on 2018/04/06.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
