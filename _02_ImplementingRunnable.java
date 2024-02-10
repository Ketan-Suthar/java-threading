
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("In runnable");
    }
}


public class _02_ImplementingRunnable {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread mt = new Thread(mr);
        mt.start();

        System.out.println("In main");
    }
}
