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


public class D13_P1 {
    public static void throwException() throws CustomException{
        throw new CustomException("CustomException thrown!");
    }
    public static void handleException(){
        try{
            throwException();
        }
        catch(CustomException e){
            System.out.println("Exception caught: "+e.getMessage());
            System.out.println("Handled by: CustomException catch block");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}