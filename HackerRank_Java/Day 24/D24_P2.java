class ThreadTransitions implements Runnable {
    private final Object lock;

    public ThreadTransitions(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                Thread.sleep(10); // Simulate some work
                lock.notify(); // Notify waiting threads
                lock.wait(); // Wait indefinitely
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class D24_P2 {
    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object(); // Dummy lock object

        // Create a new thread instance
        Thread thread1 = new Thread(new ThreadTransitions(lock));

        // NEW state
        System.out.println("Thread State: " + thread1.getState());

        // Start the thread
        thread1.start();

        // RUNNABLE state
        System.out.println("Thread State: " + thread1.getState());

        // BLOCKED state (thread1 is holding the lock)
        synchronized (lock) {
            Thread.sleep(20); // Give some time for thread1 to acquire the lock
            System.out.println("Thread State: " + thread1.getState());
        }

        // WAITING state (thread1 is waiting indefinitely)
        Thread.sleep(20); // Ensure that thread1 is waiting before checking its state
        System.out.println("Thread State: " + thread1.getState());

        // TIMED_WAITING state
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100); // Wait with timeout
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread2.start();
        Thread.sleep(20); // Give some time for thread2 to enter TIMED_WAITING state
        System.out.println("Thread State: " + thread2.getState()); // Should show TIMED_WAITING

        // Wait for thread1 to finish its execution
        thread1.interrupt();
        thread2.join();
        // Ensure that thread1 is terminated before printing its state
        System.out.println("Thread State: " + thread2.getState());
    }
}
