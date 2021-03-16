module edgent.api.topology {
    requires transitive edgent.api.execution;
    requires transitive edgent.api.function;
    requires transitive edgent.api.graph;
    requires transitive edgent.api.oplet;
    requires transitive gson;

    exports org.apache.edgent.topology;
    exports org.apache.edgent.topology.json;
    exports org.apache.edgent.topology.mbeans;
    exports org.apache.edgent.topology.plumbing;
    exports org.apache.edgent.topology.services;
    exports org.apache.edgent.topology.tester;
}
