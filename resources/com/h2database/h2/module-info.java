module com.h2database.h2 {
	requires java.sql;

	provides java.sql.Driver with org.h2.Driver;
}