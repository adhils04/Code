import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class D25_P2 {

    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("Thread Group 1");
        ThreadGroup tg2 = new ThreadGroup("Thread Group 2");

        Thread t1 = new Thread(tg1, new SynchronizedTask("1", 5));
        Thread t2 = new Thread(tg2, new SynchronizedTask("2", 8));

        t1.start();
        t2.start();
    }

    static class SynchronizedTask implements Runnable {
        private String name;
        private int priority;

        public SynchronizedTask(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public void run() {
            synchronized (this) {
                System.out.println("Thread "+name + ": Priority - " + priority +
                        ", Thread Group - [" + Thread.currentThread().getThreadGroup().getName() + "], Synchronized Task " + name);
            }
        }
    }
}


