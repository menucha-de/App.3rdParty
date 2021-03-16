module resteasy.jaxrs {
    requires java.logging;
    requires javax.ws.rs.api;
    requires javax.annotation.api;
    requires jboss.logging;

    exports org.jboss.resteasy.annotations;
    exports org.jboss.resteasy.core;
    exports org.jboss.resteasy.logging;
    exports org.jboss.resteasy.plugins.delegates;
    exports org.jboss.resteasy.plugins.providers;
    exports org.jboss.resteasy.plugins.server;
    exports org.jboss.resteasy.specimpl;
    exports org.jboss.resteasy.spi;
    exports org.jboss.resteasy.spi.interception;
    exports org.jboss.resteasy.spi.metadata;
    exports org.jboss.resteasy.util;
    exports org.jboss.resteasy.core.interception;
    exports org.jboss.resteasy.plugins.interceptors;
    exports org.jboss.resteasy.plugins.server.embedded;

    opens org.jboss.resteasy.resteasy_jaxrs.i18n to jboss.logging, resteasy.jackson2.provider;
    
    provides javax.ws.rs.ext.RuntimeDelegate with org.jboss.resteasy.spi.ResteasyProviderFactory;
}
