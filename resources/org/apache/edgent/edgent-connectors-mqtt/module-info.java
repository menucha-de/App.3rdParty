module edgent.connectors.mqtt {
    requires transitive edgent.api.function;
    requires transitive edgent.api.topology;
//    requires transitive edgent.connectors.common;
//    requires transitive edgent.connectors.iot;
    requires transitive gson;
//    requires transitive paho.client;

    requires transitive org.slf4j.jul;

    exports org.apache.edgent.connectors.mqtt;
    exports org.apache.edgent.connectors.mqtt.iot;
    exports org.apache.edgent.connectors.mqtt.runtime;
}
