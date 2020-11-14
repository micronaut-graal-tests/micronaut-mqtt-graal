# Micronaut MQTT Graal

Test application for Micronaut MQTT v3 and GraalVM.

To run Mosquitto broker in Docker:

```
docker run -it --rm -p 1883:1883 eclipse-mosquitto:1.6.12
```

To test the application:

```
curl localhost:8080/mqtt/send/Micronaut
curl localhost:8080/mqtt/messages
```
