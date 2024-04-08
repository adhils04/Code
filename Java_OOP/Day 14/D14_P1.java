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

public class D14_P1 {
    public static void CatchException() throws CustomException{
        try{
        System.out.println("Exception thrown: CustomException");
        throw new CustomException("Exception thrown: CustomException");
        
        }
        finally{
            
        }
    }

    public static void main(String[] args) {
        try{
        CatchException();
        }
        catch(CustomException e){
            System.out.println("Handled by: CustomException catch block");
        }
        finally{
            System.out.println("Finally block executed");
        }
        
    }
}