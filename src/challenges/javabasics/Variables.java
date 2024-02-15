package challenges.javabasics;

public class Variables {

    int instanceVar;
    static int staticVar;

    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.instanceVar = 30;
        obj.instanceScope();
        staticVar = 50;
        System.out.println(staticVar);
    }

    public void localScope() {
        int localVar = 10;
        System.out.println(localVar);
    }

    public void instanceScope() {
        instanceVar = 20;
    }

    public void staticScope() {
        staticVar = 60;
    }
}