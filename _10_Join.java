

class _10_Thread extends Thread {
    @Override
    public void run() {
        System.out.println("run start");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("run end");
    }
}


public class _10_Join {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        _10_Thread t = new _10_Thread();
        t.start();
        // it pauses main thread
//        t.join();
//        t.join(1000);
        t.join(8000);
//        t.sleep(1000);
        System.out.println("main end");
    }
}
