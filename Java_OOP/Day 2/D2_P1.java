/*Create an 'Employee' class with private fields and accessor/mutator methods for encapsulation. Use constructors to initialize employee details.

Input Format

Input includes employee details: name, ID, and department.

Constraints

Ensure the employee ID is a non-empty string.

Output Format

Display employee information after setting and retrieving details.

Sample Input 0

"John Doe", "E123", "Marketing"
Sample Output 0

Employee Details: Name - John Doe, ID - E123, Department - Marketing*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Employee {
    public String empname;
    public String empid;
    public String dept;

    public void getinfo(String empname, String empid, String dept) {
        this.empname = empname;
        this.empid = empid;
        this.dept = dept;
        System.out.println("Employee Details: Name - " + empname + ", ID - "+empid + ", Department - "+dept);
    }
}

public class D2_P1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee e = new Employee();
        String inputLine = input.nextLine();
        String[] arr = inputLine.split(",");
        e.empname = arr[0].replaceAll("\"","").trim();
        e.empid = arr[1].replaceAll("\"","").trim();
        e.dept = arr[2].replaceAll("\"","").trim();
        e.getinfo(e.empname,e.empid,e.dept);
    }
}