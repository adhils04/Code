import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class multithreading extends Thread{
    public void run(){
        for (int i=1;i<=2;i++){
        System.out.println("Thread "+i+": [Task Execution]");
    }
    }
}

public class D21_P1 {

    public static void main(String[] args) {
        multithreading m=new multithreading();
        m.start();
        }
    }
