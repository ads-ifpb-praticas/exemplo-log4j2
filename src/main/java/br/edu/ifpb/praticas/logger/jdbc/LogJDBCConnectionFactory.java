package br.edu.ifpb.praticas.logger.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by diogomoreira on 23/09/16.
 */
public class LogJDBCConnectionFactory {

    public static Connection getConnection() throws SQLException {
        Connection connection =
                DriverManager.getConnection("jdbc:h2:./banco.h2;" +
                        "INIT=RUNSCRIPT FROM './src/main/resources/create_schema.sql'\\;", "sa", "");
        return connection;
    }
}
