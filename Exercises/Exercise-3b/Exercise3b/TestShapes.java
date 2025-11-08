public class TestShapes {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Triangle(3, 4, 5);
        shapes[2] = new Rectangle(4, 6);
        shapes[3] = new Square(4);

        for (Shape s : shapes) {
            s.displayInfo();
            System.out.println("Area: " + s.calculateArea());
            System.out.println("Perimeter: " + s.calculatePerimeter());
            System.out.println();
        }
    }
}
