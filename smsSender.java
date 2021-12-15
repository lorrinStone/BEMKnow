// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class smsSender {
    // and the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = System.getenv("AC936db6c8a0021baa1a664f216351e14c");
    public static final String AUTH_TOKEN = System.getenv("31823dcf35a6e16c5fccd3de530a2c4a");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+15203412981"), //from (twilio) number
                new com.twilio.type.PhoneNumber("+9739053187"), //to number
                "Test Twilio Message")
            .create();

        System.out.println(message.getSid());
    }
} 