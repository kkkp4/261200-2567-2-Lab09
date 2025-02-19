public class Ellipse extends Shape {
    private double radiusA,radiusB;
    public Ellipse() {
        this.radiusA = 0;
        this.radiusB = 0;
    }
    public Ellipse(double radiusA,double radiusB) {
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }
    public void setradiusA(double radiusA) {
        this.radiusA = radiusA;
    }
    public void setradius(double radiusB) {
        this.radiusB = radiusB;
    }
    public double getradiusA() {
        return this.radiusA;
    }
    public double getradius() {
        return this.radiusB;
    }

    public double calculateArea() {
        return Math.PI * this.radiusA * this.radiusB;
    }
}
