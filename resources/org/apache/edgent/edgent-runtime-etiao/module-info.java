module edgent.runtime.etiao {
    requires gson;
    requires transitive org.slf4j.jul;

    requires transitive edgent.api.execution;
    requires transitive edgent.api.function;
    requires transitive edgent.api.graph;
    requires transitive edgent.api.oplet;
    requires transitive edgent.spi.graph;

    exports org.apache.edgent.runtime.etiao;
    exports org.apache.edgent.runtime.etiao.graph;
    exports org.apache.edgent.runtime.etiao.graph.model;
    exports org.apache.edgent.runtime.etiao.mbeans;
}
