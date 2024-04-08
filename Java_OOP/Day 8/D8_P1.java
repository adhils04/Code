import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

abstract class Animal{
    abstract void eat();
    abstract void makeSound();
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog eats bones");
    }
    void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat eats fish");
    }
    void makeSound(){
        System.out.println("Cat meows");
    }
}
class Bird extends Animal{
    void eat(){
        System.out.println("Bird eats seeds");
    }
    void makeSound(){
        System.out.println("Bird chirps");
    }
}

public class D8_P1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String n=input.nextLine();
        Dog d=new Dog();
        d.eat();
        d.makeSound();
        Cat c=new Cat();
        c.eat();
        c.makeSound();
        Bird b=new Bird();
        b.eat();
        b.makeSound();
    }
}