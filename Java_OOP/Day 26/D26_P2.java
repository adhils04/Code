import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.concurrent.*;

public class D26_P2 {

    public static void main(String[] args) {
        GenericTask<String> task1=new GenericTask<>("Performing complex generic task A");
        GenericTask<String> task2=new GenericTask<>("Coordinated execution of tasks A and B with generics");
        GenericTask<String> task3=new GenericTask<>("Performing complex generic task B");
        ExecutorService executor=Executors.newFixedThreadPool(3);
        executor.submit(task1);
        executor.submit(task3);
        executor.submit(task2);
        executor.shutdown();
    }
}
class GenericTask<T> implements Runnable{
    private String data;
    public GenericTask(String data){
        this.data=data;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+": "+data);
    }
}