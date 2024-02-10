
class _04_MyThread extends Thread {
    @Override
    public void run() {
        // in thread, will get only runnable thread
        System.out.println("in thread: " + this.getState());
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            // InterruptedException is checked exception, can not throw it because parent class
            // is not throwing InterruptedException.
            System.out.println(e);
        }
    }
}

public class _04_ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        _04_MyThread mt = new _04_MyThread();
        System.out.println("is thread alive: " + mt.isAlive());
        System.out.println(mt.getState());
        mt.start();
        System.out.println(mt.getState());
        Thread.sleep(100); // to get TIMED_WAITING state
        System.out.println(mt.getState());
        System.out.println("is thread alive: " + mt.isAlive());
        Thread.sleep(1100); // to get TERMINATED state
        System.out.println(mt.getState());
        System.out.println("is thread alive: " + mt.isAlive());
    }
}
