package challenges.objectorientedprogramming.abstraction.connection;

public abstract class ConnectionPool {

    public abstract Connection getConnection();
    public abstract void releaseConnection(Connection connection);
}