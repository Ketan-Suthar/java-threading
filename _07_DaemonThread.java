

class _07_Thread extends Thread {

    _07_Thread(boolean daemon) {
        Thread t = new Thread(this);
        t.setDaemon(daemon);
        t.start();
        System.out.println("parent name: " + super.getName());
    }

    @Override
    public void run() {
        for(int i=0; i<=100; ++i){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}


public class _07_DaemonThread {
    public static void main(String[] args) {
//        _07_Thread t = new _07_Thread(false);
//        t.setDaemon(false);
//        t.start();
//        t.setDaemon(true); // throws exception

        // if we extend from Thread for below code it will create Thread-1 and Thread-3
        _07_Thread t1 = new _07_Thread(false);
        _07_Thread t2 = new _07_Thread(false);
    }
}
