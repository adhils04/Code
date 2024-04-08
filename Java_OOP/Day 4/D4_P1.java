/*Create a Java program that represents a vehicle rental system. Implement a superclass 'Vehicle' with attributes like make, model, and year. Use inheritance to build subclasses like 'Car' and 'Motorcycle'.

Input Format

Input specifies details for vehicles: make, model, year, and additional specific attributes.

Constraints

Ensure valid input for vehicle details.

Output Format

Display vehicle details for each created object.

Sample Input 0

Car - Make: Toyota, Model: Camry, Year: 2022, Color: Red
Sample Output 0

Vehicle Details: Toyota Camry (2022), Color: Red */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Vehicle{
    String make;
    String model;
    int year;
}
class Car extends Vehicle{
    void carInfo(String x,String y,int z,String color){
        this.make=x;
        this.model=y;
        this.year=z;
        System.out.println("Vehicle Details: "+make+" "+model+" ("+year+"), Color: "+color);
    }
}
class Motorcycle extends Vehicle{
    void motoInfo(String x,String y,int z,String color){
        this.make=x;
        this.model=y;
        this.year=z;
        System.out.println("Vehicle Details: "+make+" "+model+" ("+year+"), Color: "+color);
    }
}
public class D4_P1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String line=input.nextLine();
        String[] data=new String[10];
        data=line.split(" ");
        if (data[0].equals("Car")){
            String x=data[3].replaceAll(",","");
            String y=data[5].replaceAll(",","");
            int z=Integer.parseInt(data[7].replaceAll(",",""));
            String a=data[9];
            Car c1=new Car();
            c1.carInfo(x,y,z,a);
        }
        else if (data[0].equals("Motorcycle")){
            String x=data[3].replaceAll(",","");
            String y=data[5].replaceAll(",","");
            int z=Integer.parseInt(data[7].replaceAll(",",""));
            String a=data[9];
            Motorcycle m1=new Motorcycle();
            m1.motoInfo(x,y,z,a);
        }
    }
}