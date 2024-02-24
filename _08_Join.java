
class _08_Thread extends Thread {
    @Override
    public void run() {
        System.out.println("run start");
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("run end");
    }
}


public class _08_Join {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        _08_Thread t = new _08_Thread();
        t.start();
        Thread.sleep(100);
        System.out.println("main end");
    }
}
