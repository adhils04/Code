/*Extend the shape hierarchy to include a 'Triangle' subclass inheriting from 'Shape'. Implement the area and perimeter calculation methods specifically for triangles.

Input Format

Input provides triangle dimensions like base and height.

Constraints

Ensure the triangle's base and height are positive values.

Output Format

Display calculated area and perimeter for the triangle

Sample Input 0

Triangle - Base: 5, Height: 8
Sample Output 0

Area: 20.0, Perimeter: 22.4 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

abstract class Shape{
    abstract void calc_area();
    abstract void calc_peri();
}
class Triangle extends Shape{
    int b;
    int h;
    Triangle(int b,int h){
        this.b=b;
        this.h=h;
    }
    void calc_area(){
        double area=0.5*b*h;
        System.out.print("Area: "+Math.round(area*Math.pow(10,2))/Math.pow(10,2)+", ");
    }
    void calc_peri(){
        double peri=b+h+Math.sqrt(Math.pow(b,2)+Math.pow(h,2));
        System.out.print("Perimeter: "+Math.round(peri*Math.pow(10,1))/Math.pow(10,1));
    }
}
public class D3_P2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String line=input.nextLine();
        String[] data=line.split(" ");
        String[] l=data[3].split(",");
        int b=Integer.parseInt(l[0].trim());
        int h=Integer.parseInt(data[5].trim());
        Triangle t1=new Triangle(b,h);
        t1.calc_area();
        t1.calc_peri();
                
    }
}