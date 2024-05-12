package challenges.ObjectOrientedProgramming.abstraction.connection;

public class OracleConnection implements Connection{

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing Oracle query: " + query);
    }

    @Override
    public void close() {
        System.out.println("Closing Oracle connection");
    }
}