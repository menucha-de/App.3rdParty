module iot.deps {
    requires transitive paho.client;

    exports com.microsoft.azure.sdk.iot.deps.transport.http;
    exports com.microsoft.azure.sdk.iot.deps.transport.mqtt;
    exports com.microsoft.azure.sdk.iot.deps.util;
    exports com.microsoft.azure.sdk.iot.deps.auth;
}