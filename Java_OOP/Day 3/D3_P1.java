/*Create a 'Shape' class with abstract methods for area and perimeter calculation. Extend this class to 'Circle' and 'Rectangle' subclasses. Implement these methods based on shape-specific logic.

Input Format

Input specifies dimensions like radius for circles or length, breadth for rectangles.

Constraints

Ensure the dimensions for shapes are positive values.

Output Format

Display calculated area and perimeter for each shape.

Sample Input 0

Circle - Radius: 6
Sample Output 0

Area: 113.1, Perimeter: 37.7 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

abstract class Shape{
    abstract void calc_area();
    abstract void calc_peri();
}
class Circle extends Shape{
    private int r;
    Circle(int r){
        this.r=r;
    }
    void calc_area(){
        if (r>=0){
            double area=Math.PI*(r*r);
            System.out.print("Area: "+Math.round(area*Math.pow(10,2))/Math.pow(10,2)+", ");
        }
        }
    void calc_peri(){
        if (r>=0){
            double peri=2*Math.PI*r;
            System.out.print("Perimeter: "+Math.round(peri*Math.pow(10,2))/Math.pow(10,2));
    }
    }
            
    }

class Rectangle extends Shape{
    private int x;
    private int y;
    Rectangle(int x, int y){
        this.x=x;
        this.y=y;
    }
    void calc_area(){

        if (x>=0 && y>=0){
            float area=x*y;
            System.out.print("Area: "+Math.round(area*Math.pow(10,2))/Math.pow(10,2)+", ");
        }
    }
    void calc_peri(){

        if (x>=0 && y>=0){
            float peri=2*(x+y);
            System.out.print("Perimeter: "+Math.round(peri*Math.pow(10,2))/Math.pow(10,2));
            
    }
        
    }
        
}
public class D3_P1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String line=input.nextLine();
        String[] data=line.split(" ");
        if (data[0].equals("Circle")){
            int r=Integer.parseInt(data[3].trim());
            Circle c1=new Circle(r);
            c1.calc_area();
            c1.calc_peri();
        }
        else if (data[0].equals("Rectangle")){
            int x=Integer.parseInt(data[3].trim());
            int y=Integer.parseInt(data[5].trim());
            Rectangle r1=new Rectangle(x,y);
            r1.calc_area();
            r1.calc_peri();
        }
        
    }
}