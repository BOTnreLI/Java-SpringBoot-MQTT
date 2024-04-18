## A Java SpringBoot Application for MQTT service
#### mqttFirstAttempt
This application returns data from the subscribed MQTT server (currently, a local Mosquitto MQTT server).
#### mqttPublish
This application will publish a "hello" message to the MQTT server, and the message will be captured by the `mqttFirstAttempt`
#### mysqlspringboot
This is the main service provider, by implementing RESTful API for it, the received data will be managed and stored to a local SQL server.
### To do
- [ ] Deployment to AWS S3
- [ ] Deployment to AWS EC2
- [ ] Deployment to AWS RDS
###### Apr 18 2024
