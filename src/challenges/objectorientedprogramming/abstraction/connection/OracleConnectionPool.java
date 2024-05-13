package challenges.objectorientedprogramming.abstraction.connection;

public class OracleConnectionPool extends ConnectionPool{

    @Override
    public Connection getConnection() {
        System.out.println("Oracle connection acquired");
        return new OracleConnection();
    }

    @Override
    public void releaseConnection(Connection connection) {
        System.out.println("Oracle connection released");
        connection.close();
    }
}