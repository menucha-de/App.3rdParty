module jackson.databind {
    requires java.logging;

    requires transitive jackson.annotations;
    requires transitive jackson.core;
    requires transitive java.sql;
    requires transitive java.xml;

    exports com.fasterxml.jackson.databind;
    exports com.fasterxml.jackson.databind.annotation;
    exports com.fasterxml.jackson.databind.cfg;
    exports com.fasterxml.jackson.databind.deser;
    exports com.fasterxml.jackson.databind.deser.impl;
    exports com.fasterxml.jackson.databind.deser.std;
    exports com.fasterxml.jackson.databind.exc;
    exports com.fasterxml.jackson.databind.ext;
    exports com.fasterxml.jackson.databind.introspect;
    exports com.fasterxml.jackson.databind.jsonFormatVisitors;
    exports com.fasterxml.jackson.databind.jsonschema;
    exports com.fasterxml.jackson.databind.jsontype;
    exports com.fasterxml.jackson.databind.jsontype.impl;
    exports com.fasterxml.jackson.databind.module;
    exports com.fasterxml.jackson.databind.node;
    exports com.fasterxml.jackson.databind.ser;
    exports com.fasterxml.jackson.databind.ser.impl;
    exports com.fasterxml.jackson.databind.ser.std;
    exports com.fasterxml.jackson.databind.type;
    exports com.fasterxml.jackson.databind.util;

    provides com.fasterxml.jackson.core.ObjectCodec with
        com.fasterxml.jackson.databind.ObjectMapper;

}