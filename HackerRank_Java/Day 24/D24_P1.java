import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MyThread extends Thread {
    MyThread(int i) {
        super("Thread " + i);
    }

    public void run() {
        try {
            System.out.println(getName() + ": [Task Execution]");
            sleep(2500);
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted: [Interruption Handling]");
        }
    }
}

public class D24_P1 {

    public static void main(String[] args) {
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
    }
}
