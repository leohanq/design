package pattern.design.factory.method.database;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;

@Component
public class PostgreSQLConfiguration implements IDBConfiguration {

    public static final String URL_CONNECTION = "jdbc:postgresql://localhost:5432/patterns";

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
        }
    }


    @Override
    public Connection getConnection() {
        try {
            return DriverManager
                    .getConnection(URL_CONNECTION,
                            "postgres", "admin");
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}