package FactoryMethod;

/**
 * Created by chongaizhen on 2018/04/05.
 */
public class SendFactory3 {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
