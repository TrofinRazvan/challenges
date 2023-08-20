package challenges.oop.polymorphism;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(4,2);
        shapes[1] = new Triangle(4,3);
        shapes[2] = new Circle(4);

        for (Shape shape : shapes) {
            double area = shape.area();
            System.out.println("Area of shapes: " + area);
        }
    }
}
