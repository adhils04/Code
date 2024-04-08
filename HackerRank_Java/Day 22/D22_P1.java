import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class processTask implements Runnable{
    public void run(){
        System.out.println("Process: [Task Execution]");
    }
}
class threadTask implements Runnable{
    private String name;
    public threadTask(String name){
        this.name=name;
    }
    public void run(){
        System.out.println("Thread "+name+": [Task Execution]");
    }
}
public class D22_P1 {

    public static void main(String[] args) {
        processTask processtask=new processTask();
        Thread threadtask = new Thread(processtask);
        threadtask.run();
        threadTask t1=new threadTask("1");
        threadTask t2=new threadTask("2");
        t1.run();
        t2.run();
        
    }
}