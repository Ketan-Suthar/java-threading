package _01_executor_service;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Thread1 extends Thread {
    @Override
    public void run() {
        var thread = Thread.currentThread();
        System.out.println("---- thread info ----");
        System.out.println("Id: " + thread.getId());
        System.out.println("Name: " + thread.getName());
        System.out.println("Priority: " + thread.getPriority());
        System.out.println("ThreadGroup: " + thread.getThreadGroup());
        System.out.println("ThreadGroup.Parent: " + thread.getThreadGroup().getParent());
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        var thread = Thread.currentThread();
        System.out.println("---- thread info ----");
        System.out.println("Id: " + thread.getId());
        System.out.println("Name: " + thread.getName());
        System.out.println("Priority: " + thread.getPriority());
        System.out.println("ThreadGroup: " + thread.getThreadGroup());
        System.out.println("ThreadGroup.Parent: " + thread.getThreadGroup().getParent());
    }
}

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        var t = new Thread1();
        t.start();
        t.join();

        var t2 = new Thread2();
        var e = Executors.newSingleThreadExecutor();
        e.execute(t2);
        e.awaitTermination(1000, TimeUnit.SECONDS);

        Thread.currentThread().setName("MyMain");
        e.execute(t2);
        e.awaitTermination(1000, TimeUnit.SECONDS);

        e = Executors.newSingleThreadExecutor();
        e.execute(t2);
//        e.awaitTermination(1000, TimeUnit.SECONDS);

        e.shutdownNow();
//        e.awaitTermination(1000, TimeUnit.SECONDS);
    }
}
