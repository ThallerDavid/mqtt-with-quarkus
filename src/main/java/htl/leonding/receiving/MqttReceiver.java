package htl.leonding.receiving;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

import java.util.logging.Logger;

@ApplicationScoped
public class MqttReceiver {

    private Logger logger = Logger.getLogger(MqttReceiver.class.getName());

    @Incoming("channelname")
    public void receiveMeasurement(byte[] byteArray) {
        String messageString = new String(byteArray);
        logger.info("Received raw message: " + messageString);
    }
}
