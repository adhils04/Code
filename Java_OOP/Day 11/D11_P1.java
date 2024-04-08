import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


interface Shape{
    public void draw();
}
abstract class shape{
    public void display(){
        System.out.println("Displaying shape...");
    }
}
class Circle extends shape implements Shape{
    public void draw(){
        System.out.println("Drawing circle");
    }
}
class Rectangle extends shape implements Shape{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}

public class D11_P1 {

    public static void main(String[] args) {

        Circle c1=new Circle();
        c1.draw();
        ((shape) c1).display();
        Rectangle r1=new Rectangle();
        r1.draw();
    }
}