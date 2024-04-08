import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface complex{
    public void method1();
    public void method2();
    public void method3();
}
class Demo implements complex{
    public void method1(){
        System.out.println("Method 1 implemented successfully");
    }
    public void method2(){
        System.out.println("Method 2 implemented successfully");
    }
    public void method3(){
        System.out.println("Method 3 implemented successfully");
    }
}

public class D11_P2 {

    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.method1();
        d1.method2();
        d1.method3();
    }
}