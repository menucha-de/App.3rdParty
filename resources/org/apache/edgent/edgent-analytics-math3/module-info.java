module edgent.analytics.math3 {
    requires transitive commons.math3;
    requires transitive edgent.api.topology;
	requires transitive edgent.api.function;
    requires transitive gson;

    exports org.apache.edgent.analytics.math3;
    exports org.apache.edgent.analytics.math3.json;
    exports org.apache.edgent.analytics.math3.stat;
    exports org.apache.edgent.analytics.math3.utils;
}
