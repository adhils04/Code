import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class D10_P2 {

    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: ArithmeticException");
            System.out.println("Exception caught: CustomCheckedException");
        }
    }
}