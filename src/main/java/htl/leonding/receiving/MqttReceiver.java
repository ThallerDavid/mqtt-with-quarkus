package htl.leonding.receiving;

import io.quarkus.runtime.StartupEvent;
import io.smallrye.reactive.messaging.annotations.Broadcast;
import io.smallrye.reactive.messaging.annotations.Merge;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Message;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import javax.enterprise.context.ApplicationScoped;

import java.util.logging.Logger;

@ApplicationScoped
public class MqttReceiver {

    private Logger logger = Logger.getLogger(MqttReceiver.class.getName());

    @Incoming("channelname")
    public void receiveMessage(byte[] byteArray) {
        String messageString = new String(byteArray);
        logger.info("Received message: " + messageString);
    }

}