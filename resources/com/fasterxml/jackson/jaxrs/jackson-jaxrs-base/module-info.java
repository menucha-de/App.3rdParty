module jackson.jaxrs.base {
    requires jackson.annotations;

    requires transitive jackson.core;
    requires transitive jackson.databind;
    requires transitive javax.ws.rs.api;

    exports com.fasterxml.jackson.jaxrs.annotation;
    exports com.fasterxml.jackson.jaxrs.base;
    exports com.fasterxml.jackson.jaxrs.cfg;
    exports com.fasterxml.jackson.jaxrs.util;

}