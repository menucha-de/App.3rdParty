module iot.device.client {
    requires transitive java.logging;
    requires transitive iot.deps;
    requires transitive paho.client;
    requires transitive org.slf4j.jul;

    exports com.microsoft.azure.sdk.iot.device;
    exports com.microsoft.azure.sdk.iot.device.transport;
}