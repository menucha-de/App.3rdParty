module jaxb.api {
    requires java.logging;

    requires transitive java.xml;

    exports javax.xml.bind;
    exports javax.xml.bind.annotation;
    exports javax.xml.bind.annotation.adapters;
    exports javax.xml.bind.attachment;
    exports javax.xml.bind.helpers;
    exports javax.xml.bind.util;

}