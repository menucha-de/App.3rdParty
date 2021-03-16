module edgent.api.oplet {
    requires transitive edgent.api.execution;
    requires transitive edgent.api.function;
    // TODO: circular
    // requires transitive edgent.api.window;

    exports org.apache.edgent.oplet;
    exports org.apache.edgent.oplet.core;
    exports org.apache.edgent.oplet.functional;
    exports org.apache.edgent.oplet.plumbing;
    exports org.apache.edgent.oplet.window;
}
