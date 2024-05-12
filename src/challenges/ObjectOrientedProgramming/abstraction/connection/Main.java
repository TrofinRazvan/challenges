package challenges.ObjectOrientedProgramming.abstraction.connection;

public class Main {

    public static void main(String[] args) {
        ConnectionPool mySQLConnectionPool = new MySQLConnectionPool();
        Connection mySQLConnection = mySQLConnectionPool.getConnection();
        mySQLConnection.executeQuery("SELECT * FROM users");
        mySQLConnectionPool.releaseConnection(mySQLConnection);

        System.out.println();

        ConnectionPool oracleConnectionPool = new OracleConnectionPool();
        Connection oracleConnection = oracleConnectionPool.getConnection();
        oracleConnection.executeQuery("SELECT * FROM employees");
        oracleConnectionPool.releaseConnection(oracleConnection);
    }
}