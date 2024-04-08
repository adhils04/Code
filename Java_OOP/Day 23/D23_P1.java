import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MyThread extends Thread {
    MyThread(String n){
        System.out.println("Thread "+n+": [Task Execution]");
    }
}

public class D23_P1 {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread("1");
        MyThread thread2 = new MyThread("2");

    }
}
