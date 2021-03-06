module jackson.core {
    exports com.fasterxml.jackson.core;
    exports com.fasterxml.jackson.core.base;
    exports com.fasterxml.jackson.core.format;
    exports com.fasterxml.jackson.core.io;
    exports com.fasterxml.jackson.core.json;
    exports com.fasterxml.jackson.core.sym;
    exports com.fasterxml.jackson.core.type;
    exports com.fasterxml.jackson.core.util;

    provides com.fasterxml.jackson.core.JsonFactory with
        com.fasterxml.jackson.core.JsonFactory;

}