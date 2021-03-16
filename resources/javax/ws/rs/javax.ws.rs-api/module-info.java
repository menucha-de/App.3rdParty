module javax.ws.rs.api {
    requires java.logging;

    requires transitive java.xml;
    requires transitive jaxb.api;

    exports javax.ws.rs;
    exports javax.ws.rs.client;
    exports javax.ws.rs.container;
    exports javax.ws.rs.core;
    exports javax.ws.rs.ext;

    uses javax.ws.rs.ext.RuntimeDelegate;
}
