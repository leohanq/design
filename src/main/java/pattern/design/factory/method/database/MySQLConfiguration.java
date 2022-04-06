package pattern.design.factory.method.database;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;

@Component
public class MySQLConfiguration implements IDBConfiguration {

    public static final String URL_CONNECTION = "jdbc:mysql://localhost:33060/patterns?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";

    static {
        try {
            new com.mysql.cj.jdbc.Driver();
        } catch (Exception e) {
        }
    }


    @Override
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL_CONNECTION, "root", "admin");
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}