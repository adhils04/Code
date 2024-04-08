import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface Class{
    public void display();
}
class Class1 implements Class{
    public void display(){
        System.out.println("Class 1: Method Implementation");
    }
}
class Class2 implements Class{
    public void display(){
        System.out.println("Class 2: Method Implementation");
    }
}

public class D10_P1 {

    public static void main(String[] args) {
        Class1 c1=new Class1();
        Class2 c2=new Class2();
        c1.display();
        c2.display();
    }
}