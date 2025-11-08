package Exercise3b;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    @Override
    void displayInfo() {
        System.out.println("This is a Rectangle with length " + length +
                ", width " + width + " and color " + color);
    }
}
