public class Rectangle extends Shape {
    private double width,height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }
    public void setwidth(double width) {
        this.width = width;
    }
    public void setheight(double height) {
        this.height = height;
    }
    public double getwidth() {
        return this.width;
    }
    public double getheight() {
        return this.height;
    }

    public double calculateArea() {
        return this.width * this.height;
    }

}
