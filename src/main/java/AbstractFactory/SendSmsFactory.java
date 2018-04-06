package AbstractFactory;

/**
 * Created by chongaizhen on 2018/04/06.
 */
public class SendSmsFactory implements Provider{

    public Sender produce() {
        return new SmsSender();
    }
}
