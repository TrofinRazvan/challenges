package challenges.ObjectOrientedProgramming.abstraction.connection;

public class MySQLConnection implements Connection{

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing MySQL query: " + query);
    }

    @Override
    public void close() {
        System.out.println("Closing MySQL connection");
    }
}