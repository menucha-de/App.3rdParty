module resteasy.netty4 {
	requires io.netty.codec;
	requires io.netty.codec.http;
	requires io.netty.transport;
	requires jboss.logging;

	requires transitive javax.ws.rs.api;
	requires transitive resteasy.jaxrs;

	exports org.jboss.resteasy.plugins.server.netty;
	exports org.jboss.resteasy.plugins.server.netty.i18n;
}