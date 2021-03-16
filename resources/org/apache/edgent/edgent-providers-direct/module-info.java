module edgent.providers.direct {

	requires edgent.runtime.etiao;
	requires edgent.runtime.jsoncontrol;

    requires transitive edgent.api.execution;
    requires transitive edgent.api.function;
    requires transitive edgent.api.graph;
    requires transitive edgent.api.topology;
    requires transitive edgent.spi.topology;
    requires transitive gson;

    exports org.apache.edgent.providers.direct;
}
