
class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("From MyRunnable1");
    }
}

class MyThread1 extends Thread {

    public MyThread1(){
        super();
    }

    public MyThread1(Runnable r){
        super(r);
    }

    @Override
    public void run() {
        System.out.println("From MyThread1");
        // try with and without super.run()
        super.run();
    }
}


public class _03_Practice1 {
    static MyThread1 mts;

    public static void main(String[] args) {
//        MyRunnable1 mr = new MyRunnable1();
//        MyThread1 mt = new MyThread1(mr);
//        mt.start();
        MyThread1 mt2 = new MyThread1();
        MyThread1 mt3 = new MyThread1(mt2);
        mt3.start();

//        MyThread1 mt2 = new MyThread1();
//        MyThread1 mt3 = new MyThread1(mt2);
//        MyThread1 mt4 = new MyThread1(mt3);
//        mt4.start();

//        MyThread1 mt2 = new MyThread1();
//        MyThread1 mt3 = new MyThread1(mt2);
//        mt2 = new MyThread1(mt3);
//        mt3 = new MyThread1(mt2);
//        mt3.start();

//        MyThread1 mt4 = new MyThread1(mt4);
//        mt4.start();

//        mts = new MyThread1(mts);
//        mts.start();
    }
}
