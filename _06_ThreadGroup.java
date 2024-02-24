
class _06_MyThread extends Thread {
    _06_MyThread() {}
    _06_MyThread(String name) { super(name);}
    _06_MyThread(ThreadGroup tg, String name) { super(tg, name);}

    @Override
    public void run() {
        for(int i=0; i<=10; ++i){
            System.out.println(getName() + " - " + i);
        }
    }
}


public class _06_ThreadGroup {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup());
        ThreadGroup tg = new ThreadGroup("Ks Group");
        tg.setMaxPriority(3);
        Thread t = new _06_MyThread(tg, "t");
        System.out.println(t.getThreadGroup());
    }
}
