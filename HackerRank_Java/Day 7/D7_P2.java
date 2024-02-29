import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Vehicle{
    void display(){
        System.out.println("Starting the engine of the vehicle...");
    }
}
class Car extends Vehicle{
    void display(){
        System.out.println("Starting the engine of the car...");
    }
}
class Motorcycle extends Vehicle{
    void display(){
        System.out.println("Starting the engine of the motorcycle...");
    }
}

public class D7_P2 {

    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        Car c=new Car();
        Motorcycle m=new Motorcycle();
        v.display();
        c.display();
        m.display();
        c.display();
        m.display();
    }
}