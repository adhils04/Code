/*Design a Java program to manage a company's employee hierarchy. Implement classes for 'Employee', 'Manager', and 'Director' with specific attributes and access modifiers. Illustrate the use of access control in different scenarios.

Input Format

N/A

Constraints

None

Output Format

Display information about employees, managers, and directors with their respective details and illustrate how access control affects the visibility of attributes in different classes.

Sample Input 0

na
Sample Output 0

Employee Details:
Employee ID: 1001
Name: John Doe
Department: HR
Salary: 50000.0

Manager Details:
Employee ID: 2001
Name: Jane Smith
Department: Marketing
Salary: 60000.0
Team: Marketing Team

Director Details:
Employee ID: 3001
Name: Alice Johnson
Department: Finance
Salary: 80000.0
Team: Finance Team
Department Budget: $1,000,000
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Employee{
    int empid;
    String empname;
    String dept;
    double salary;
    void getInfo(int a,String b,String c,double d){
        empid=a;
        empname=b;
        dept=c;
        salary=d;
        System.out.println("Employee Details:");
        System.out.println("Employee ID: "+empid);
        System.out.println("Name: "+empname);
        System.out.println("Department: "+dept);
        System.out.println("Salary: "+salary);
        System.out.println();
    }    
}
class Manager{
    int empid;
    String empname;
    String dept;
    double salary;
    String team;
    void getInfo(int a,String b,String c,double d,String e){
        empid=a;
        empname=b;
        dept=c;
        salary=d;
        team=e;
        System.out.println("Manager Details:");
        System.out.println("Employee ID: "+empid);
        System.out.println("Name: "+empname);
        System.out.println("Department: "+dept);
        System.out.println("Salary: "+salary);
        System.out.println("Team: "+team);
        System.out.println();
    }
}
class Director{
    int empid;
    String empname;
    String dept;
    double salary;
    String team;
    String deptbudget;
    void getInfo(int a,String b,String c,double d,String e,String f){
        empid=a;
        empname=b;
        dept=c;
        salary=d;
        team=e;
        deptbudget=f;
        System.out.println("Director Details:");
        System.out.println("Employee ID: "+empid);
        System.out.println("Name: "+empname);
        System.out.println("Department: "+dept);
        System.out.println("Salary: "+salary);
        System.out.println("Team: "+team);
        System.out.println("Department Budget: "+deptbudget);
        System.out.println();
    }
}

public class D5_P1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        Employee e1=new Employee();
        e1.getInfo(1001,"John Doe","HR",50000.0);
        Manager m1=new Manager();
        m1.getInfo(2001,"Jane Smith","Marketing",60000.0,"Marketing Team");
        Director d1=new Director();
        d1.getInfo(3001,"Alice Johnson","Finance",80000.0,"Finance Team","$1,000,000");
    }
}