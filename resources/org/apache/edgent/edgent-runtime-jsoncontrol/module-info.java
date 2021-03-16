module edgent.runtime.jsoncontrol {

	requires transitive org.slf4j.jul;

    requires transitive edgent.api.execution;
    requires transitive gson;

    exports org.apache.edgent.runtime.jsoncontrol;
}