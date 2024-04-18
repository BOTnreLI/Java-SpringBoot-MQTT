package standalone.mqttpublisher;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class App {
    public static void main(String[] args) {
        String brokerUrl = "tcp://localhost:1883";
        String topic = "testTopic";
        String clientId = "JavaPublisher";

        // Try-with-resources to ensure that the client is closed
        try (MqttClient client = new MqttClient(brokerUrl, clientId)) {
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            client.connect(connOpts);

            MqttMessage message = new MqttMessage("Hello, MQTT!".getBytes());
            client.publish(topic, message); // 'topic' is used here
        } catch (MqttException me) {
            // Handle exceptions
        }
        // The MqttClient will be closed automatically at the end of the try block
    
    }
}
