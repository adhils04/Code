import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MyThread implements Runnable {
    private String threadName;
    
    public MyThread(String threadName) {
        this.threadName = threadName;
    }
    
    public void run() {
        System.out.println("Thread " + threadName + ": [Task Execution]");
    }
}

public class D23_P2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("1");
        Thread thread1 = new Thread(t1);
        thread1.run();
        
        MyThread t2 = new MyThread("2");
        Thread thread2 = new Thread(t2);
        thread2.run();
    }
}
