
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("In thread");
    }
}

class OneTo26 extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=26;++i)
            System.out.println(i);
    }
}

class AToZ extends Thread {
    @Override
    public void run() {
        for(int i=0;i<26;++i)
            System.out.println((char)(i + 'a'));
    }
}

public class _01_ExtendThread {
    public static void main(String[] args) {
        AToZ mt = new AToZ();
        OneTo26 mt2 = new OneTo26();
        // by calling start, custom thread is ready to run.
        // it makes
        mt.start();
        mt2.start();
//        System.out.println("In main");
    }
}
