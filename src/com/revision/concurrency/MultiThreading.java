package com.revision.concurrency;

public class MultiThreading {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Inside the thread " + Thread.currentThread().getName());
        });

        thread.setName("Thread-100");
        thread.start();
        thread.join();
        System.out.println("Main thread " + Thread.currentThread().getName());
    }
}
