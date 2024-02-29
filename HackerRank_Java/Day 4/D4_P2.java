/*Extend the vehicle rental system to include a 'Truck' subclass inheriting from 'Vehicle'. Implement unique attributes and methods for the 'Truck' class.

Input Format

Input includes details for trucks: make, model, year, payload capacity

Constraints

Ensure valid input for truck details and positive payload capacity.

Output Format

Display truck details and calculated payload capacity.

Sample Input 0

Truck - Make: Ford, Model: F-150, Year: 2023, Payload Capacity: 2000 kg
Sample Output 0

Truck Details: Ford F-150 (2023), Payload Capacity: 2000 kg */

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
class Truck extends Vehicle{
    void truckInfo(String x,String y,int z,String pc){
        this.make=x;
        this.model=y;
        this.year=z;
        System.out.println("Truck Details: "+make+" "+model+" ("+year+"), Payload Capacity: "+pc);
    }
}
public class D4_P2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String line=input.nextLine();
        String[] data=new String[10];
        data=line.split(" ");
        String x=data[3].replaceAll(",","");
        String y=data[5].replaceAll(",","");
        int z=Integer.parseInt(data[7].replaceAll(",",""));
        String a=data[10]+" "+data[11];
        Truck t1=new Truck();
        t1.truckInfo(x,y,z,a);
        
    }
}