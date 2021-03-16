module jackson.module.jaxb.annotations {
    requires transitive jackson.annotations;
    requires transitive jackson.core;
    requires transitive jackson.databind;
    requires transitive java.xml;
    requires transitive jaxb.api;

    exports com.fasterxml.jackson.module.jaxb;
    exports com.fasterxml.jackson.module.jaxb.deser;
    exports com.fasterxml.jackson.module.jaxb.ser;

    provides com.fasterxml.jackson.databind.Module with
        com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

}