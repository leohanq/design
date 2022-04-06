package pattern.design.factory.method.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pattern.design.factory.method.database.IDBConfiguration;
import pattern.design.factory.method.database.MySQLConfiguration;
import pattern.design.factory.method.database.PostgreSQLConfiguration;

@Component
public class DBConfigurationFactory {

    @Value("${database.type}")
    private String databaseType;

    @Autowired
    private MySQLConfiguration mysql;

    @Autowired
    private PostgreSQLConfiguration postgrest;

    public IDBConfiguration getConfiguration() {
        switch (databaseType) {
            case "MYSQL":
                return mysql;
            case "POSTGRESQL":
                return postgrest;
            default:
                throw new RuntimeException("Type not Found");
        }
    }
}