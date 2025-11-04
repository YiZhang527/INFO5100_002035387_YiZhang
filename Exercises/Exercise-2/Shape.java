abstract class Shape {
    static String color = "Blue";

    abstract double calculateArea();
    abstract double calculatePerimeter();

    void displayInfo() {
        System.out.println("This is a shape of color " + color);
    }
}
