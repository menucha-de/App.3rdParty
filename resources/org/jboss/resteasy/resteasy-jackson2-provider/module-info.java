module resteasy.jackson2.provider {
    requires jackson.core;
    requires jackson.jaxrs.base;

    requires transitive jackson.databind;
    requires transitive jackson.jaxrs.json.provider;
    requires transitive javax.ws.rs.api;
    requires transitive resteasy.jaxrs;

    exports org.jboss.resteasy.annotations.providers.jackson;
    exports org.jboss.resteasy.plugins.providers.jackson;

    opens org.jboss.resteasy.plugins.providers.jackson;

    //provides javax.ws.rs.ext.Providers with
    //    org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider;

}