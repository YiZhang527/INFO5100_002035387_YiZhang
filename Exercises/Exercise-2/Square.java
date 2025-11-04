public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    void displayInfo() {
        System.out.println("This is a Square with side " + length + " and color " + color);
    }
}
