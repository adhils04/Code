import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface Inter1{
    void display1();
}
interface Inter2 extends Inter1{
    void display2();
}
interface Inter3 extends Inter2{
    void display3();
}
class Demo{
    void display1(){
        System.out.println("Interface 1: [Functionality]");
    }
    void display2(){
        System.out.println("Interface 2: [Functionality]");
    }
    void display3(){
        System.out.println("Interface 3: [Functionality]");
    }
    void display4(){
        System.out.println("Class: [Integrated Functionality]");
    }
}

public class D12_P2 {

    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.display1();
        d1.display2();
        d1.display3();
        d1.display4();
    }
}