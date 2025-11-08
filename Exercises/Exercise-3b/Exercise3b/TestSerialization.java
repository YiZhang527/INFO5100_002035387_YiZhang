package Exercise3b;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestSerialization {
    public static void main(String[] args) {
        System.out.println("=== Testing Serialization of Exercise 2 Objects ===\n");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0));
        shapes.add(new Square(3.0));
        shapes.add(new Triangle(3.0, 4.0, 5.0));

        System.out.println("Serializing objects to file...");
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("shapes.ser"))) {
            oos.writeObject(shapes);
            System.out.println("✓ Serialization successful!\n");
        } catch (IOException e) {
            System.out.println("✗ Serialization failed: " + e.getMessage());
            return;
        }

        System.out.println("Deserializing objects from file...");
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("shapes.ser"))) {
            List<Shape> loadedShapes = (List<Shape>) ois.readObject();
            System.out.println("✓ Deserialization successful!");
            System.out.println("✓ Restored " + loadedShapes.size() + " shapes\n");

            System.out.println("Verifying deserialized objects:");
            System.out.println("-".repeat(40));
            for (int i = 0; i < loadedShapes.size(); i++) {
                Shape shape = loadedShapes.get(i);
                System.out.println("Object " + (i+1) + ": " + shape.getClass().getSimpleName());
                shape.displayInfo();
                System.out.printf("Area: %.2f\n", shape.calculateArea());
                System.out.printf("Perimeter: %.2f\n", shape.calculatePerimeter());
                System.out.println("-".repeat(40));
            }

            System.out.println("\n✓ All objects successfully serialized and deserialized!");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("✗ Deserialization failed: " + e.getMessage());
        }
    }
}
