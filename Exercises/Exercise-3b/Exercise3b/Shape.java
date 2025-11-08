package Exercise3b;

import java.io.Serializable;

abstract class Shape implements Serializable {
    static String color = "Blue";

    abstract double calculateArea();
    abstract double calculatePerimeter();

    void displayInfo() {
        System.out.println("This is a shape of color " + color);
    }
}
