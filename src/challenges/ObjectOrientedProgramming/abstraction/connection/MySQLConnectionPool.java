package challenges.ObjectOrientedProgramming.abstraction.connection;

public class MySQLConnectionPool extends ConnectionPool{

    @Override
    public Connection getConnection() {
        System.out.println("MySQL connection acquired");
        return new MySQLConnection();
    }

    @Override
    public void releaseConnection(Connection connection) {
        System.out.println("MySQL connection released");
        connection.close();
    }
}