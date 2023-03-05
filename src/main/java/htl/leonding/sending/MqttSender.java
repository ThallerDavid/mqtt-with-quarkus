package htl.leonding.sending;

import org.eclipse.microprofile.reactive.messaging.Outgoing;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MqttSender {

    @Outgoing("channelname2")
    public byte[] sendMessage() {
        try {
            Thread.sleep(5000); // 5 Sekunden Verzögerung
            return "Hello i am David!".getBytes();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }

    }


}
