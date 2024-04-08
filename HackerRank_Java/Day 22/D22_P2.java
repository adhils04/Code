import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class D22_P2 {

    public static void main(String[] args) {
        // Create a new thread
        Thread thread = new Thread(new MyRunnable());

        // Print the initial state of the thread
        System.out.println("Thread State: " + thread.getState());

        // Start the thread
        thread.start();

        try {
            // Sleep for a short while to ensure the thread starts and moves to a runnable state
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the state after starting the thread
        System.out.println("Thread State: " + thread.getState());

        try {
            // Wait for a short while for the thread to complete
            Thread.sleep(1000); // Wait for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the thread to make sure it exits the waiting state
        thread.interrupt();

        try {
            // Wait for the thread to complete
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final state of the thread
        System.out.println("Thread State: " + thread.getState());
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (this) {
                // Print the state of the thread when it is running
                System.out.println("Thread State: " + Thread.currentThread().getState());

                try {
                    // Wait indefinitely for notification from another thread
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



