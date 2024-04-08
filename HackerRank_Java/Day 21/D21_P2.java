import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class SharedResource {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public synchronized int getCount() {
        return count;
    }
}

class WorkerThread extends Thread {
    private SharedResource sharedResource;
    private int id;
    public WorkerThread(SharedResource sharedResource, int id) {
        this.sharedResource = sharedResource;
        this.id=id;
    }

    public void run() {
        sharedResource.increment();
        System.out.println("Thread " + id + ": [Task Execution]");
        
    }
}

public class D21_P2 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        WorkerThread thread1 = new WorkerThread(sharedResource,1);
        WorkerThread thread2 = new WorkerThread(sharedResource,2);

        thread1.start();
        thread2.start();
    }
}
