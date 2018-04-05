package FactoryMethod;

/**
 * Created by chongaizhen on 2018/04/05.
 */
public class SendFactory2 {

    public Sender produceMail(){
        return new MailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }
}
