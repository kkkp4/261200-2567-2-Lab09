public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public void setradius(double radius) {
        this.radius = radius;
    }
    public double getradius() {
        return this.radius;
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
