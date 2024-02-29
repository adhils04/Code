/*Develop a Java program illustrating access control and inheritance in a hierarchical structure. Construct classes representing 'Animal', 'Mammal', and 'Dog' with distinct access modifiers for their attributes and methods.

Create classes 'Animal', 'Mammal', and 'Dog'. Define attributes like species, name, age, and methods like 'eat()' and 'makeSound()' with varying access modifiers. Demonstrate how these access modifiers impact inheritance and method overriding.

Input Format

N/A

Constraints

None

Output Format

Display details about animals, mammals, and dogs by calling their methods, showcasing how access modifiers influence the visibility and behavior of attributes and methods.

Sample Input 0

na
Sample Output 0

Animal Details:
Animal is eating.
Animal is making a sound.

Mammal Details:
Animal is eating.
Mammal is making a sound.

Dog Details:
Animal is eating.
Dog is barking.
Dog is fetching. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
    String species;
    String name;
    int age;
    public void eat(){
        System.out.println("Animal is eating.");
    }
    protected void makeSound(){
        System.out.println("Animal is making a sound.");
    }
}
class Mammal extends Animal{
    protected void makeSound(){
        System.out.println("Mammal is making a sound.");
    }
}
class Dog extends Animal{
    protected void makeSound(){
        System.out.println("Dog is barking.");
        System.out.println("Dog is fetching.");
    }
}
public class D5_P2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a = input.nextLine();
        Animal a1=new Animal();
        System.out.println("Animal Details:");
        a1.eat();
        a1.makeSound();
        System.out.println();
        Mammal m1=new Mammal();
        System.out.println("Mammal Details:");
        m1.eat();
        m1.makeSound();
        System.out.println();
        Dog d1=new Dog();
        System.out.println("Dog Details:");
        d1.eat();
        d1.makeSound();
        
    }
}