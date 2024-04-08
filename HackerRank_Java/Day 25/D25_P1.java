import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class D25_P1 extends Thread {

    public static void main(String[] args) {
        Solution t1=new Solution();
        Solution t2=new Solution();
        t1.setPriority(5);
        t2.setPriority(8);
        System.out.println("Thread 1: Priority - "+t1.getPriority()+", Thread Group - [Thread Group 1]");
        System.out.println("Thread 2: Priority - "+t2.getPriority()+", Thread Group - [Thread Group 2]");
    }
}