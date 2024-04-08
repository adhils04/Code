import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}

public class D14_P2 {
    public static void IOException() throws CustomException{
            System.out.println("Exception caught: IOException");
            throw new CustomException("Exception caught: IOException");
    } 

    public static void main(String[] args) {
        try{
            IOException();
        }
        catch(CustomException e){
            System.out.println("Handled by: IOException catch block");
        }
        
    }
}