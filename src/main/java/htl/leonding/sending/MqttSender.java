package htl.leonding.sending;


import org.eclipse.microprofile.reactive.messaging.Outgoing;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MqttSender {

    @Outgoing("channelname2")
    public byte[] sendMessage() {
            return "Hello i am David!".getBytes();
        }

    }

