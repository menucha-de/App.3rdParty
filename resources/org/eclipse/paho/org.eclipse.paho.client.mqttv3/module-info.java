module paho.client {
    requires transitive java.logging;
    requires transitive java.prefs;

    exports org.eclipse.paho.client.mqttv3;
    exports org.eclipse.paho.client.mqttv3.internal;
    exports org.eclipse.paho.client.mqttv3.internal.security;
    exports org.eclipse.paho.client.mqttv3.internal.websocket;
    exports org.eclipse.paho.client.mqttv3.internal.wire;
    exports org.eclipse.paho.client.mqttv3.logging;
    exports org.eclipse.paho.client.mqttv3.persist;
    exports org.eclipse.paho.client.mqttv3.util;

    uses org.eclipse.paho.client.mqttv3.spi.NetworkModuleFactory;
    
    provides org.eclipse.paho.client.mqttv3.spi.NetworkModuleFactory
        with org.eclipse.paho.client.mqttv3.internal.TCPNetworkModuleFactory,
             org.eclipse.paho.client.mqttv3.internal.SSLNetworkModuleFactory,
             org.eclipse.paho.client.mqttv3.internal.websocket.WebSocketNetworkModuleFactory,
             org.eclipse.paho.client.mqttv3.internal.websocket.WebSocketSecureNetworkModuleFactory;
}