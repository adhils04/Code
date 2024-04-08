import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class D13_P2 {
    public static class CustomException extends Exception{
        public CustomException(String message){
            super(message);
    }
}
    public static void methodL1() throws CustomException{
        try{
            methodL2();
        }
        catch(CustomException e){
            System.out.println("Exception caught at Method Level 1: "+e.getMessage());
            System.out.println("Handled by: Method Level 1 catch block");
            
        }
    }
    public static void methodL2() throws CustomException{
        throw new CustomException("CustomException from Method Level 2");
    }

    public static void main(String[] args) {
        try{
            methodL1();
        }
        catch(CustomException e){
            System.out.println("Handled by: Method Level 1 catch block");
        }
    }
}