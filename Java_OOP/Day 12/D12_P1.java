import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface Inter1{
    void display();
}
interface Inter2 extends Inter1{

}
class Demo{
    void display(){
        System.out.println("Interface 1: [Functionality]");
        System.out.println("Interface 2 (Extended): [Additional Functionality]");
        System.out.println("Class: [Implemented Functionality]");
    }
    
}

public class D12_P1 {

    public static void main(String[] args) {
        Demo d=new Demo();
        d.display();
    }
}