import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MathConstants{
    final double pi=3.14159;
    final double en=2.71828;
    final void display(){
        System.out.println("Pi: "+pi);
        System.out.println("Euler's Number: "+en);
    }

    }
class Student{
    final String std1name="Alice";
    final String std2name="Bob";
    final int std1id=1;
    final int std2id=2;
    final void display(){
        System.out.println("Student 1: "+std1name+", ID: "+std1id);
        System.out.println("Student 2: "+std2name+", ID: "+std2id);
        }
    }

public class D6_P2 {

    public static void main(String[] args) {
        MathConstants mc=new MathConstants();
        mc.display();
        Student s=new Student();
        s.display();
        
        
    }
}