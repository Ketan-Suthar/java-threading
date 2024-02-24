
class _09_Thread extends Thread {
    @Override
    public void run() {
        System.out.println("run start");
        try {
            Thread.sleep(2_000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }

        // one interrupt call is applied only one time
        try {
            Thread.sleep(3_000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("run end");
    }
}



public class _09_Interrupt {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        _09_Thread t = new _09_Thread();
        // one interrupt call is applied only one time
        t.interrupt();
        t.start();

//        t.interrupt();
        Thread.sleep(1000);
        t.interrupt();

        System.out.println("main end");
    }
}
