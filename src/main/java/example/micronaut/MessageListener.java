package example.micronaut;

import io.micronaut.mqtt.annotation.MqttSubscriber;
import io.micronaut.mqtt.annotation.Topic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@MqttSubscriber
public class MessageListener {

    private final List<MessageResponse> messages = Collections.synchronizedList(new ArrayList<>());

    @Topic("message")
    public void receiveMessage(MessageRequest message) {
        messages.add(new MessageResponse(message.getText()));
    }

    public List<MessageResponse> getMessages() {
        return messages;
    }
}
