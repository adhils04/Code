import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Final class Shape
class Shape {
    public final void display() { // final method
        System.out.println("This is a shape.");
    }
}

// Circle class inheriting from Shape
class Circle extends Shape {
    // Attempting to override final method (compilation error)
    /*
    public void display() {
        System.out.println("This is a circle.");
    }
    */
}

// Rectangle class inheriting from Shape
class Rectangle extends Shape {
    // Attempting to override final method (compilation error)
    /*
    public void display() {
        System.out.println("This is a rectangle.");
    }
    */
}

// Final class to prevent inheritance
final class FinalClass {
    // Cannot be extended
}

// Attempted subclass of final class (compilation error)
/*
class SubFinalClass extends FinalClass {
}
*/

public class D6_P1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Accessing final method
        circle.display();
        rectangle.display(); 

        // Attempting to inherit from a final class (compilation error)
        // SubFinalClass subFinalClass = new SubFinalClass();
    }
}