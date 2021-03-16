module edgent.api.execution {
//    requires transitive edgent.api.function;
    requires transitive gson;

    exports org.apache.edgent.execution;
    exports org.apache.edgent.execution.mbeans;
    exports org.apache.edgent.execution.services;
}
