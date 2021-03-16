module edgent.spi.topology {
    requires edgent.api.window;

    requires transitive edgent.api.execution;
    requires transitive edgent.api.function;
    requires transitive edgent.api.graph;
    requires transitive edgent.api.oplet;
    requires transitive edgent.api.topology;
    requires transitive gson;

    exports org.apache.edgent.topology.spi;
    exports org.apache.edgent.topology.spi.functions;
    exports org.apache.edgent.topology.spi.graph;
    exports org.apache.edgent.topology.spi.tester;
}
