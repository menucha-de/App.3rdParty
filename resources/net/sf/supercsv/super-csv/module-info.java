module supercsv {
    requires transitive java.sql;

    exports org.supercsv.cellprocessor;
    exports org.supercsv.cellprocessor.constraint;
    exports org.supercsv.cellprocessor.ift;
    exports org.supercsv.comment;
    exports org.supercsv.encoder;
    exports org.supercsv.exception;
    exports org.supercsv.io;
    exports org.supercsv.prefs;
    exports org.supercsv.quote;
    exports org.supercsv.util;

}