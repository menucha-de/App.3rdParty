module resteasy.jaxb.provider {
	requires jboss.logging;
    
	requires transitive java.xml;
	requires transitive javax.ws.rs.api;
	requires transitive jaxb;
	requires transitive jaxb.api;
	requires transitive resteasy.jaxrs;
    
	exports org.jboss.resteasy.annotations.providers.jaxb;
	exports org.jboss.resteasy.plugins.providers.jaxb;
	exports org.jboss.resteasy.plugins.stats;
    exports org.jboss.resteasy.plugins.providers.jaxb.i18n;

    opens org.jboss.resteasy.plugins.providers.jaxb;
}
