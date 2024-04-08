import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Outer{
    void show(){
        System.out.println("Outer Class: Outer Class Details");
    
    class Inner1{
        void show(){
            System.out.println("Inner Class 1 accessing outer private member: 10");
        }
    }
    Inner1 in1=new Inner1();
    in1.show();
    class Inner2{
        void show(){
            System.out.println("Inner Class 2 accessing outer private member: 10");
        }
    }
    Inner2 in2=new Inner2();
    in2.show();
}
}

public class D9_P2 {
    

    public static void main(String[] args) {
        Outer in=new Outer();
        in.show();
    }
}