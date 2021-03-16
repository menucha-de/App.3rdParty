module resteasy.jdk.http {
    requires transitive javax.ws.rs.api;
    requires transitive jdk.httpserver;
    requires transitive resteasy.jaxrs;

    exports org.jboss.resteasy.plugins.server.sun.http;

}
