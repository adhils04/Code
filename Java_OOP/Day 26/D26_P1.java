import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.concurrent.*;

public class D26_P1 {

    public static void main(String[] args) {
        
        GenericTask<String> task1 = new GenericTask<>("Performing generic task A");

        
        GenericTask<String> task2 = new GenericTask<>("Performing generic task 2");

        
        ExecutorService executor = Executors.newFixedThreadPool(2);

        
        executor.submit(task1);
        executor.submit(task2);

        
        executor.shutdown();
    }
}

class GenericTask<T> implements Runnable {
    private T data;

    public GenericTask(T data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + data);
    }
}
