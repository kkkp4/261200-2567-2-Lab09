public class Main {
    public static double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public static void main(String[] args) {
        Shape R = new Rectangle(5,2);
        Shape C = new Circle(3);
        Shape E = new Ellipse(3,2);

        System.out.println(calculateArea(R));
        System.out.println(calculateArea(C));
        System.out.println(calculateArea(E));
    }
}

