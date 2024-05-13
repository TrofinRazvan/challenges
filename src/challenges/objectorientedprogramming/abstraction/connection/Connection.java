package challenges.objectorientedprogramming.abstraction.connection;

public interface Connection {

    void executeQuery(String query);
    void close();
}