package htl.leonding.sending;

public class MqttSender {
}

/*


import htl.leonding.receiving.MqttReceiver;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.reactive.messaging.Message;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import javax.enterprise.context.ApplicationScoped;
import java.util.logging.Logger;


@ApplicationScoped
public class MqttSender {

    private Logger logger = Logger.getLogger(MqttReceiver.class.getName());

    @ConfigProperty(name = "mp.messaging.incoming.channelname.topic")
    String topicName;

    @Outgoing("channelname")
    public Message<String> sendMessage() {
        String message = "Hello i am David!";
        logger.info(String.format("Sent message '%s' to MQTT topic", message, topicName));
        return Message.of(message);
    }

}

*/