package AbstractFactory;

/**
 * Created by chongaizhen on 2018/04/06.
 */
public class SendMailFactory implements Provider {

    public Sender produce(){
        return new MailSender();
    }
}
