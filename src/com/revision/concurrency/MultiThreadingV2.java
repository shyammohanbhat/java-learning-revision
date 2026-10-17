package com.revision.concurrency;

/**
Create a Runnable task for Worker A that prints numbers 1 to 5, with a 500 ms delay between each number.
Create a Runnable task for Worker B that prints letters A to E, also with a 500 ms delay between each letter.
Name the threads "Worker-A" and "Worker-B" before starting them.
Start both threads.
Use join() so the main thread waits until both workers finish.
Print "All workers completed" from the main thread after both finish.
 */
public class MultiThreadingV2 {
    public static void main(String[] args) throws InterruptedException{
        Thread workerA = new Thread(() -> {
            for(int i=1; i<=5; i++){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        workerA.setName("Worker-A");

        Thread workerB = new Thread(() -> {
            for (char i='A'; i<='E'; i++){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        workerB.setName("Worker-B");

        workerA.start();
        workerB.start();
        workerA.join();
        workerB.join();

        System.out.println("All workers completed");
    }
}
