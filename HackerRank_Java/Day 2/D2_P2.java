/*Extend the previous 'Employee' class to include a subclass 'Manager'. The 'Manager' class inherits from 'Employee' and adds a field for the department managed.

Input Format

Input includes manager details: name, ID, department, managed department.

Constraints

Ensure the managed department field is a non-empty string.

Output Format

Display manager information after setting and retrieving details.

Sample Input 0

"Sarah Davis", "M123", "Operations", "Logistics"
Sample Output 0

Manager Details: Name - Sarah Davis, ID - M123, Department - Operations, Managed Department - Logistics*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Employee {
    public String empname;
    public String empid;
    public String dept;
    public String manage;
}
class Manager extends Employee{
    public void getinfo(String empname, String empid, String dept,String manage) {
        this.empname = empname;
        this.empid = empid;
        this.dept = dept;
        this.manage=manage;
        System.out.println("Manager Details: Name - " + empname + ", ID - "+empid + ", Department - "+dept+", Managed Department - "+manage);
    }
}

public class D2_P2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager m = new Manager();
        String inputLine = input.nextLine();
        String[] arr = inputLine.split(",");
        m.empname = arr[0].replaceAll("\"","").trim();
        m.empid = arr[1].replaceAll("\"","").trim();
        m.dept = arr[2].replaceAll("\"","").trim();
        m.manage= arr[3].replaceAll("\"","").trim();
        m.getinfo(m.empname,m.empid,m.dept,m.manage);
    }
}