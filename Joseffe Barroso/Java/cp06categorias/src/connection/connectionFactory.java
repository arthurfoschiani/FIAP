package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionFactory {
	private static Connection connection;

    public static Connection getConnection() throws SQLException {

        String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        String user = "rm96525";
        String password = "211203";
        connection = DriverManager.getConnection(url, user, password);

        return connection;
    }	
}
