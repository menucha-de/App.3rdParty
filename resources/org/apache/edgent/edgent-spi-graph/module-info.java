module edgent.spi.graph {
    requires transitive edgent.api.execution;
    requires transitive edgent.api.function;
    requires transitive edgent.api.graph;
    requires transitive edgent.api.oplet;

    exports org.apache.edgent.graph.spi;
    exports org.apache.edgent.graph.spi.execution;

}
