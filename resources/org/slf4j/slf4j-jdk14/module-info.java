module org.slf4j.jul {
	requires transitive org.slf4j;
	requires transitive java.logging;

    exports org.slf4j.impl;
    opens org.slf4j.impl to org.slf4j;
}