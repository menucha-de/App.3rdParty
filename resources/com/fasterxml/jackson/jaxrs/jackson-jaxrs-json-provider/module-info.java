module jackson.jaxrs.json.provider {
    requires jackson.annotations;
    requires jackson.module.jaxb.annotations;

    requires transitive jackson.core;
    requires transitive jackson.databind;
    requires transitive jackson.jaxrs.base;
    requires transitive javax.ws.rs.api;

    exports com.fasterxml.jackson.jaxrs.json;
    exports com.fasterxml.jackson.jaxrs.json.annotation;

    opens com.fasterxml.jackson.jaxrs.json;

    provides javax.ws.rs.ext.MessageBodyReader with
        com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
    provides javax.ws.rs.ext.MessageBodyWriter with
        com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

}