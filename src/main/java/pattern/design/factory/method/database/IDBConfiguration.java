package pattern.design.factory.method.database;

import java.sql.Connection;

public interface IDBConfiguration {

    Connection getConnection();
}
