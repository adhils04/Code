import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Shape{
    void calculateArea(){
        System.out.println("Calculating area of generic shape...");
    }
}
class Circle{
    private int r;
    void calculateArea(int r){
        this.r=r;
        double area=Math.PI*r*r;
        System.out.println("Area of Circle: "+area);
    }
}
class Rectangle{
    private int l;
    private int b;
    void calculateArea(int l, int b){
        this.l=l;
        this.b=b;
        double area=l*b;
        System.out.println("Area of Rectangle: "+area);
    }
}

public class D7_P1 {

    public static void main(String[] args) {
        Shape s=new Shape();
        s.calculateArea();
        Circle c1=new Circle();
        c1.calculateArea(5);
        Rectangle r1=new Rectangle();
        r1.calculateArea(4,6);
        Circle c2=new Circle();
        c2.calculateArea(7);
        r1.calculateArea(4,6);
    }
}